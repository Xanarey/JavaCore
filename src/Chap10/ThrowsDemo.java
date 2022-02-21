package Chap10;

public class ThrowsDemo {
    static void throwOne() {
        System.out.println("In body meth throwOne().");
        throw  new IllegalArgumentException("demo");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal  " + e);
        }

    }
}
