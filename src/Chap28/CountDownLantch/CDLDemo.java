package Chap28.CountDownLantch;

import java.util.concurrent.CountDownLatch;

public class CDLDemo {
    public static void main(String[] args) {
        CountDownLatch cdl = new CountDownLatch(5);
        System.out.println("            " + new Thread(new MyThread(cdl)).getState());
        System.out.println("Запуск потока исполнения");

        new Thread(new MyThread(cdl)).start();



        try {
            cdl.await();
            System.out.println("            " + new Thread(new MyThread(cdl)).getState());
        } catch (InterruptedException e) {
            System.out.println("Поток прерван" + e);
        }
        System.out.println("Завершение потока исполнения");
        System.out.println("            " + new Thread(new MyThread(cdl)).getState());
    }
}

class MyThread implements Runnable {
    CountDownLatch latch;

    public MyThread(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("            " + new Thread(new MyThread(latch)).getState());
            System.out.println(i);
            latch.countDown();
            System.out.println("COUNT : " + latch.getCount());
        }
        System.out.println("pinch!");
        latch.countDown();
        System.out.println("COUNT : " + latch.getCount());
    }
}
