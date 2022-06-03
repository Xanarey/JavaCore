package Chap28.Callable_and_Future.Exc3;

import java.util.concurrent.*;

public class CallableD {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        Future<Integer> f;


        System.out.println("Start");

        f = es.submit(new Sum(5));
        try {
            System.out.println(f.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        es.shutdown();
        System.out.println("Finish");
    }
}

class Sum implements Callable<Integer> {
    int stop;

    Sum(int s) {
        stop = s;
    }


    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= stop; i++)
            sum += i;
        return sum;
    }
}