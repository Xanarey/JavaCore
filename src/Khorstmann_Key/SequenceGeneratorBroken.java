package Khorstmann_Key;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class SequenceGeneratorBroken {


    private static final AtomicInteger counter = new AtomicInteger();
    public static int nextInt() { return counter.getAndIncrement(); }



    public static void main(String[] args) throws InterruptedException {
        List<Thread> threads = new ArrayList<>();
        Semaphore semaphore = new Semaphore(2);

        for (int j = 0; j < 5; j++) {
            DemoThread thread = new DemoThread(semaphore);
            threads.add(thread);
            thread.start();
        }

        for (int i = 0; i < 10; ++i) {
            Thread thread = new Thread( () -> {
                for (int j = 0; j < 1000; ++j)
                    nextInt();
            });
            thread.start();
            threads.add(thread);
        }

        for (Thread thread :  threads)
            thread.join();

        System.out.println("Counter final value: " + counter);
    }

    public static class DemoThread extends Thread {
        private final Semaphore semaphore;

        private DemoThread(Semaphore semaphore) {
            this.semaphore = semaphore;
        }

        @Override
        public void run() {
            try {
                runUnsafe();
            } catch (InterruptedException e) {
                System.out.println(e + "interrupted");
            }
        }

        private void runUnsafe() throws InterruptedException {
            for (;;) {
                semaphore.acquire();
                try {
                    System.out.println(getName() + "semaphore.acquire");
                    Thread.sleep(5000L);
                } finally {
                    System.out.println(getName() + "semaphore.release");
                    semaphore.release();
                }
            }
        }
    }
}
