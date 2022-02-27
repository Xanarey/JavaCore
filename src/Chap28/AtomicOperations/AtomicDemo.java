package Chap28.AtomicOperations;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicDemo {
    public static void main(String[] args) {
        new Thread(new AtomThread("A")).start();
        new Thread(new AtomThread("B")).start();
        new Thread(new AtomThread("C")).start();
    }
}

class Shared {
    static AtomicInteger ai = new AtomicInteger(0);
}

class AtomThread implements Runnable {
    String name;

    public AtomThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Запуск потока " + name);

        for (int i = 1; i <= 3; i++)
            System.out.println("Поток " + name
            + " получено: " + Shared.ai.getAndSet(i));
    }
}
