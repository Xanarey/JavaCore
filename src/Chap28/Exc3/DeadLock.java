package Chap28.Exc3;

public class DeadLock {
    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();

        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                synchronized (lock2) {

                }
            }
        }, "Thread1");

        Thread thread2 = new Thread(() -> {
            synchronized (lock2) {
                synchronized (lock1) {

                }
            }
        }, "Thread1");
    }
}
