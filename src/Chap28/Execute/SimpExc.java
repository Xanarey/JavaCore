package Chap28.Execute;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpExc {
    public static void main(String[] args) {
        CountDownLatch count1 = new CountDownLatch(5);
        CountDownLatch count2 = new CountDownLatch(5);
        CountDownLatch count3 = new CountDownLatch(5);
        CountDownLatch count4 = new CountDownLatch(5);
        ExecutorService es = Executors.newFixedThreadPool(4);

        es.execute(new MyThread("A", count1));
        es.execute(new MyThread("B", count2));
        es.execute(new MyThread("C", count3));
        es.execute(new MyThread("D", count4));

        try {
            count1.await();
            count2.await();
            count3.await();
            count4.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        es.shutdown();

        System.out.println("Завершение потоков ExecutorService");
    }
}

class MyThread implements Runnable {
    String name;
    CountDownLatch latch;

    public MyThread(String name, CountDownLatch latch) {
        this.name = name;
        this.latch = latch;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " : " + i);
            latch.countDown();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}