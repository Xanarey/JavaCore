package Khorstmann_Key;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Main {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        for (int i = 0; i < 3; i++)
            es.execute(new Demo());
        es.shutdown();
    }
}

public class Demo implements Runnable {
    private int count = 0;

    public Demo() {
        System.out.println("Start!");
    }

    @Override
    public void run() {
        while (count++ != 3) {
            System.out.println(Thread.currentThread().getName() + " : " + count);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Thread.yield();
        }
        System.out.println("Finish");
    }
}