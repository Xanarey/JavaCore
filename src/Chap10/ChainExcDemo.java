package Chap10;

public class ChainExcDemo {

    static void demoproc() {
        NullPointerException e = new NullPointerException("верхний уровень");

        e.initCause(new ArithmeticException());

        throw e;
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("перехвачено искл : " + e);

            System.out.println("первопричина : " + e.getCause());
        }


    }
}
