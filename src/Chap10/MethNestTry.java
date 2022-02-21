package Chap10;

public class MethNestTry {
    static void nesttry(int a) {
        try {
            if (a == 1) a = a / (a - a);

            if (a == 2) {
                int[] c = {1};
                c[42] = 99;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("1 " + e);
        }
    }

    public static void main(String[] args) {
        try {
            int a = 2;

            int b = 42 / a;
            System.out.println(" a = " + a);
            nesttry(a);
        } catch (ArithmeticException e) {
            System.out.println(" 2 " + e);
        }
    }
}
