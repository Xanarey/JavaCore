package Chap11;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class BarDemo {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new BarAction());
        System.out.println("Запуск потоков");

        new Thread(new MyThread2(cyclicBarrier, "A")).start();
        new Thread(new MyThread2(cyclicBarrier, "B")).start();
        new Thread(new MyThread2(cyclicBarrier, "C")).start();
        new Thread(new MyThread2(cyclicBarrier, "D")).start();
        new Thread(new MyThread2(cyclicBarrier, "E")).start();
        new Thread(new MyThread2(cyclicBarrier, "F")).start();
    }
}

class MyThread2 implements Runnable {
    CyclicBarrier cyclicBarrier;
    String name;

    public MyThread2(CyclicBarrier cyclicBarrier, String name) {
        this.cyclicBarrier = cyclicBarrier;
        this.name = name;

    }

    @Override
    public void run() {
        System.out.println(name);
        try {
            cyclicBarrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}

class BarAction implements Runnable {
    @Override
    public void run() {
        System.out.println("Барьер достигнут");
    }
}
