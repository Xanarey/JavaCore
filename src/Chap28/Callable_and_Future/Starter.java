package Chap28.Callable_and_Future;

import java.util.concurrent.*;

public class Starter {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService es = Executors.newFixedThreadPool(5);

        Future<Integer> sub = es.submit(new MyCallable());

        Thread.sleep(1000);

        System.out.println("Shutdown");
        es.shutdown();
    }
}

class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() {
        try {
            System.out.println("Started: " + Thread.currentThread().getId());
            Thread.sleep(5000);
            System.out.println("Finished: " + Thread.currentThread().getId());
        } catch (InterruptedException e) {
            e.printStackTrace(System.out);
        }
        return 99;
    }
}