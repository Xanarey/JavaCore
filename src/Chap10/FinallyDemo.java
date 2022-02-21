package Chap10;

public class FinallyDemo {

    static void procA() {
        try {
            System.out.println("In body meth procA()");
            throw new RuntimeException("Demo");
        } finally {
            System.out.println("finally in procA");
        }
    }

    static void procB() {
        try {
            System.out.println("In body meth procB()");
            return;
        } finally {
            System.out.println("finally in procB");
        }
    }

    static void procC() {
        try {
            System.out.println("In body meth procC()");
        } finally {
            System.out.println("finally in procC");
        }
    }

    public static void main(String[] args) {

        try {
            procA();
        } catch (Exception e) {
            System.out.println("Exc");
        }

        procB();
        procC();

    }
}
