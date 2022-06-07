package Chap28.Exc_1;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Phas {

}

class F {
    private int count;
    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    public void first (Runnable r) {
        lock.lock();

    }
    public void second (Runnable r) {

    }
    public void third (Runnable r) {

    }
}

