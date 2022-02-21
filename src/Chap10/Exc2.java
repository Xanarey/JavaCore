package Chap10;

public class Exc2 {
    public static void main(String[] args) {

        int d, a;

        try {
            d = 0;
            a = 42 / d;
            System.out.println("none");
        } catch (ArithmeticException e) {
            System.out.println("Arith error" + e);
        }

        System.out.println("after");

    }
}
