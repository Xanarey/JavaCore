package Chap28.Callable_and_Future.Exc1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

public class CallableExample {

    public static void main(String[] args) {
        new CallableExample();
    }

    public CallableExample() {

        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Future<String>> futures = new ArrayList<>();
        Callable<String> callable = new CallableClass();

        for (int i = 0; i < 3; i++) {
            Future<String> future = executor.submit(callable);
            futures.add(future);
        }

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss ");
        for (Future<String> future : futures) {
            try {
                String text = sdf.format(new Date()) + future.get();
                System.out.println(text);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();
    }
}

class CallableClass implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("TEST");
        return Thread.currentThread().getName();
    }
}