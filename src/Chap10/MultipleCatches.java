package Chap10;

public class MultipleCatches {
    public static void main(String[] args) {
        String[] ac = {"sad"};
        args = ac;
        try {
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42 / a;
            int[] c = {1};
            c[42] = 99;
        } catch (ArithmeticException e) {
            System.out.println(" / on zero " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index ERROR" + e);
        }

        System.out.println("after try / catch");

    }
}
