package Chap28.Phaser;

import java.util.concurrent.Phaser;

public class PhaserDemo {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        int curPhase;

        System.out.println("Запуск потоков: ");

        new Thread(new MyThread(phaser, "A")).start();
        new Thread(new MyThread(phaser, "B")).start();
        new Thread(new MyThread(phaser, "C")).start();

        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("            Фаза " + curPhase + " завершена");

        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("            Фаза " + curPhase + " завершена");

        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("            Фаза " + curPhase + " завершена");

        phaser.arriveAndDeregister();

        if (phaser.isTerminated())
            System.out.println("Синхронизатор фаз завершен");
    }
}

class MyThread implements Runnable {
    Phaser phsr;
    String name;

    public MyThread(Phaser phsr, String name) {
        this.phsr = phsr;
        this.name = name;
        phsr.register();
    }

    @Override
    public void run() {
        System.out.println("Поток " +  name + " начинает первую фазу");
        phsr.arriveAndAwaitAdvance();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("Потоко прерван " + e);
        }

        System.out.println("Поток " +  name + " начинает вторую фазу");
        phsr.arriveAndAwaitAdvance();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("Потоко прерван " + e);
        }

        System.out.println("Поток " +  name + " начинает третью фазу");
        phsr.arriveAndDeregister();
    }
}
