package Chap10;

public class MultiCatch {
    public static void main(String[] args) {
        int a = 10, b = 0;
        int[] vals = {1, 2, 3};

        try {
            int result = a / b;
        } catch (ArithmeticException |
                ArrayIndexOutOfBoundsException e) {
            System.out.println("high exc : " + e);
        }
        System.out.println("many exc");
    }
}
