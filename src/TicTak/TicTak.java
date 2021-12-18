package TicTak;

import java.util.*;

public class TicTak {

    static ArrayList<Integer> playerPosition = new ArrayList<>();
    static ArrayList<Integer> pcPosition = new ArrayList<>();

    public static void main(String[] args) {

        char[][] gameBoard = {{' ', '|' ,' ' ,'|', ' '},
                              {'-', '+', '-' ,'+', '-'},
                              {' ', '|' ,' ' ,'|', ' '},
                              {'-', '+', '-' ,'+', '-'},
                              {' ', '|' ,' ' ,'|', ' '}};

        printGameBoard(gameBoard);

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your placement (1-9): ");
            int playerPos = scanner.nextInt();
            while (playerPosition.contains(playerPos) || pcPosition.contains(playerPos)) {
                System.out.println("Correct position! : ");
                playerPos = scanner.nextInt();
            }

            placePiece(gameBoard, playerPos, "player");

            String result = checkWinner();
            if(result.length() > 0) {
                System.out.println(result);
                printGameBoard(gameBoard);
                break;
            }

            Random random = new Random();
            int pcPos = random.nextInt(9) + 1;
            while (playerPosition.contains(pcPos) || pcPosition.contains(pcPos)) {
                pcPos = random.nextInt(9) + 1;
            }
            placePiece(gameBoard, pcPos, "pc");

            printGameBoard(gameBoard);

            result = checkWinner();
            if(result.length() > 0) {
                System.out.println(result);
                printGameBoard(gameBoard);
                break;
            }

        }

    }

    public static void printGameBoard(char[][] gameBoard) {
        for(char[] row : gameBoard) {
            for(char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void placePiece(char[][] gameBoard, int pos, String user) {

        char symbol = ' ';

        if(user.equals("player")) {
            symbol = 'X';
            playerPosition.add(pos);
        } else if(user.equals("pc")) {
            symbol = 'Ѻ';
            pcPosition.add(pos);
        }

        switch (pos) {
            case 1 -> gameBoard[0][0] = symbol;
            case 2 -> gameBoard[0][2] = symbol;
            case 3 -> gameBoard[0][4] = symbol;
            case 4 -> gameBoard[2][0] = symbol;
            case 5 -> gameBoard[2][2] = symbol;
            case 6 -> gameBoard[2][4] = symbol;
            case 7 -> gameBoard[4][0] = symbol;
            case 8 -> gameBoard[4][2] = symbol;
            case 9 -> gameBoard[4][4] = symbol;
            default -> {
            }
        }
    }

    public static String checkWinner() {

        List<Integer> topRow = Arrays.asList(1,2,3);
        List<Integer> midRow = Arrays.asList(4,5,6);
        List<Integer> botRow = Arrays.asList(7,8,9);

        List<Integer> leftCol = Arrays.asList(1,4,7);
        List<Integer> midCol = Arrays.asList(2,5,8);
        List<Integer> rightCol = Arrays.asList(3,6,9);

        List<Integer> leftCross = Arrays.asList(1,5,9);
        List<Integer> rightCross = Arrays.asList(3,5,7);

        List<List> winning = new ArrayList<>();
        winning.add(topRow);
        winning.add(midRow);
        winning.add(botRow);

        winning.add(leftCol);
        winning.add(midCol);
        winning.add(rightCol);

        winning.add(leftCross);
        winning.add(rightCross);

        for(List l: winning) {
            if(playerPosition.containsAll(l)) {
                return "You won!";
            } else if(pcPosition.containsAll(l)) {
                return "You lose";
            } else if(playerPosition.size() + pcPosition.size() == 9) {
                return "CAT";
            }
        }


        return "";
    }
}
