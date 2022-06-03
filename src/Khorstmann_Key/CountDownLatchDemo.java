package Khorstmann_Key;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
    public static void main(String[] args) {
        CountDownLatch count = new CountDownLatch(5);

        for (int i = 0; i < 5; i++)
            new DemoThread(count).start();

    }

    private static class DemoThread extends Thread {
        private final CountDownLatch latch;

        public DemoThread(CountDownLatch latch) {
            this.latch = latch;
        }

        @Override
        public void run() {
            try {
                runUnsafe();
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted");
            }
        }

        private void runUnsafe() throws InterruptedException {
            Thread.sleep((long) (Math.random() * 10000L));
            System.out.println(getName() + " finished initialization");

            latch.countDown();
            latch.await();

            System.out.println(getName() + " enterefd main phase");
            Thread.sleep((long) (Math.random() * 10000L));
        }
    }
}
