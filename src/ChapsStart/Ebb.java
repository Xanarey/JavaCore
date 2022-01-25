package ChapsStart;

public class Ebb {
    static int x = 7;

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        for (int y = 0; y < 3; y++) {
            x++;
            switch (x) {
                case 8:
                    s.append("8 ");
                case 9:
                    s.append("9 ");
                case 10: {
                    s.append("10 ");
                    break;
                }
                default:
                    s.append("d ");
                case 13:
                    s.append("13 ");
            }
        }
        System.out.println(s);
    }

    static {
        x++;
    }
}

// 9 10 10 d 13