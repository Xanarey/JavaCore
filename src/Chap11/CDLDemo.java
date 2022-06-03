package Chap11;

import java.util.concurrent.CountDownLatch;

public class CDLDemo {
    public static void main(String[] args) {
        CountDownLatch cd1 = new CountDownLatch(5);

        System.out.println("Запуск потока исполнения");

        new MyThread(cd1);

        try {
            cd1.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Основной поток завершился");
    }
}

class MyThread implements Runnable {
    CountDownLatch latch;

    public MyThread(CountDownLatch latch) {
        this.latch = latch;
        run();
    }

    @Override
    public void run() {
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
            latch.countDown();
        }
    }
}
