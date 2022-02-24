package Chap28.Phaser2;

import java.util.concurrent.Phaser;

class PhaserDemo2 {
    public static void main(String[] args) {

        MyPhaser phsr = new MyPhaser(1, 4);

        System.out.println("Запуск потоков \n");

        new Thread(new MyThread(phsr, "A")).start();
        new Thread(new MyThread(phsr, "B")).start();
        new Thread(new MyThread(phsr, "C")).start();

        while (!phsr.isTerminated()) {
            phsr.arriveAndAwaitAdvance();
        }

        System.out.println("Синхронизатор фаз завершен");
    }
}

public class MyPhaser extends Phaser {

    int numPhases;

    MyPhaser(int parties, int phaseCount) {
        super(parties);
        numPhases = phaseCount - 1;
    }

    @Override
    protected boolean onAdvance(int phase, int registeredParties) {
        System.out.println("Фаза " +  phase + " завершена.\n");

        if (phase == numPhases || registeredParties == 0) {
            return true;
        }

        return false;
    }
}

class MyThread implements Runnable {

    Phaser phsr;
    String name;

    MyThread(Phaser phsr, String name) {
        this.phsr = phsr;
        this.name = name;
        phsr.register();
    }

    @Override
    public void run() {
        while (!phsr.isTerminated()) {
            System.out.println("Поток " + name + " начинает фазу" +
                    phsr.getPhase());

            phsr.arriveAndAwaitAdvance();

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("Поток прерван " + e);
            }
        }
    }
}