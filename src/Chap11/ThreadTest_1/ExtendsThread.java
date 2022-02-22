package Chap11.ThreadTest_1;

public class ExtendsThread extends Thread {

    ExtendsThread() {
        super("демонстрационный Второй поток");
        System.out.println("Второй Дочерний поток: \n" + this);
        start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Второй Дочерний поток: " + i);
                Thread.sleep(501);
            }
        } catch (InterruptedException e) {
            System.out.println("Второй Дочерний поток прерван: " + e);
        }
        System.out.println("Второй Дочерний поток завершен");
    }
}
