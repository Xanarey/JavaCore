package Chap28.Lock;

import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();

        new Thread(new LockThread("A", lock)).start();
        new Thread(new LockThread("B", lock)).start();
    }
}

class Shared {
    static int count = 0;
}

class LockThread implements Runnable {
    String name;
    ReentrantLock lock;

    public LockThread(String name, ReentrantLock lock) {
        this.name = name;
        this.lock = lock;
    }

    @Override
    public void run() {
        System.out.println("Запуск потока " + name);

        try {
            System.out.println("Поток " + name
                    + " ожидает блокировки счетчика");
            lock.lock();
            System.out.println("Поток " + name
                    + " блокирует счетчик");
            Shared.count++;
            System.out.println("Поток " + name + ": "
            + Shared.count);
            System.out.println("Поток " + name
                    + " ожидает");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Поток прерван " + e);
        } finally {
            System.out.println("Поток " + name
            + " разблокирует счетчик");
            lock.unlock();
        }
    }
}


