package Chap11;
import java.util.concurrent.*;

public class RecallClass {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(1);

        IncThread A = new IncThread(sem, "A");
        A.run();
        DecThread B = new DecThread("B", sem);
        B.run();


    }
}

class Shared {
    static int count = 0;
}

class IncThread implements Runnable {
    String name;
    Semaphore sem;

    public IncThread(Semaphore sem, String name) {
        this.name = name;
        this.sem = sem;
    }

    @Override
    public void run() {
        System.out.println("Запуск потока " + name);
        try {
            System.out.println("Поток " + name + " ожидает разрешение");
            sem.acquire();
            System.out.println("Поток " + name + " получает разрешение к общему ресурсу");

            for (int i = 5; i > 0; i--) {
                Shared.count++;
                System.out.println(name + ": " + Shared.count);

                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Поток " + name + " освобождает разрешение");
        sem.release();
    }
}

class DecThread implements Runnable {
    String name;
    Semaphore sem;

    public DecThread(String name, Semaphore sem) {
        this.name = name;
        this.sem = sem;
    }

    @Override
    public void run() {
        System.out.println("Запуск потока " + name);
        try {
            System.out.println("Поток " + name + " ожидает разрешение");
            sem.acquire();
            System.out.println("Поток " + name + " получает разрешение к общему ресурсу");

            for (int i = 5; i > 0; i--) {
                Shared.count--;
                System.out.println(name + ": " + Shared.count);

                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Поток " + name + " освобождает разрешение");
        sem.release();
    }
}