package Chap28.CyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class BarDemo {
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(3, new BarAction());

        System.out.println("Запуск потоков: ");

        new Thread(new MyThread(cb, "A")).start();
        new Thread(new MyThread(cb, "B")).start();
        new Thread(new MyThread(cb, "C")).start();
        new Thread(new MyThread(cb, "X")).start();
        new Thread(new MyThread(cb, "Y")).start();
        new Thread(new MyThread(cb, "Z")).start();
    }
}

class MyThread implements Runnable {
    CyclicBarrier cbar;
    String name;

    public MyThread(CyclicBarrier cbar, String name) {
        this.cbar = cbar;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name);

        try {
            cbar.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}

class BarAction implements Runnable {
    @Override
    public void run() {
        System.out.println("Барьер достигнут!");
    }
}
