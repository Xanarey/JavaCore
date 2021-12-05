public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;


        System.out.println(
                "\nПреобразование типа int в тип byte :)"
        );
        b = (byte)i;
        System.out.print("i and b " + i + " "  + b);
    }
}
