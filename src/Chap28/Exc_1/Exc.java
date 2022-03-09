package Chap28.Exc_1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Exc {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

    }
}

class Foo {
    private int count = 0;
    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    public void first(Runnable r) throws InterruptedException {
        lock.lock();
        try {
            while (count != 0) {
                condition.await();
            }
            count++;
            r.run();
            System.out.print("first");
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void second(Runnable r) throws InterruptedException {
        lock.lock();
        try {
            while (count != 1) {
                condition.await();
            }
            count++;
            r.run();
            System.out.print("second");
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void third(Runnable r) throws InterruptedException {
        lock.lock();
        try {
            while (count != 2) {
                condition.await();
            }
            r.run();
            System.out.print("third");
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

}

