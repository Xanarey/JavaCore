package Chap28.Exc_1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Exc2 {

    public static void main(String[] args) {
        Bar bar = new Bar();
        bar.third(new Thread());
        bar.second(new Thread());
        bar.first(new Thread());
    }
}

class Bar {
    private int count;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public Bar() {
        this.count = 1;
    }

    public void first(Runnable r) {
        lock.lock();
        try {
            r.run();
            this.count++;
            condition.signalAll();
            System.out.println("first");
        } finally {
            lock.unlock();
        }
    }

    public void second(Runnable r) {
        lock.lock();
        try {
            while (count != 2) {
                condition.await();
            }
            r.run();
            this.count++;
            condition.signalAll();
            System.out.println("second");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void third(Runnable r) {
        lock.lock();
        try {
            while (count != 3) {
                condition.await();
            }
            r.run();
            this.count++;
            condition.signalAll();
            System.out.println("third");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
