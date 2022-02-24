package Chap28.Exec;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpExec {
    public static void main(String[] args) throws InterruptedException {

        CountDownLatch cd1 = new CountDownLatch(5);
        CountDownLatch cd2 = new CountDownLatch(5);
        CountDownLatch cd3 = new CountDownLatch(5);
        CountDownLatch cd4 = new CountDownLatch(5);
        ExecutorService es = Executors.newFixedThreadPool(2);

        System.out.println("Запуск потоков");

        MyThread mt1 = new MyThread("A", cd1);
        MyThread mt2 = new MyThread("B", cd2);
        MyThread mt3 = new MyThread("C", cd3);
        MyThread mt4 = new MyThread("D", cd4);

        es.execute(new MyThread("A", cd1));
        es.execute(new MyThread("B", cd2));
        es.execute(new MyThread("C", cd3));
        es.execute(new MyThread("D", cd4));


        try {
            cd1.await();
            cd2.await();
            cd3.await();
            cd4.await();
        } catch (InterruptedException e) {
            System.out.println("Поток прерван " + e);
        }

        es.shutdown();
        System.out.println("Завершение потоков");
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
        for (int i = 0; i < 5; i++) {
            System.out.println(name + ": " + i);
            latch.countDown();
        }
    }
}


