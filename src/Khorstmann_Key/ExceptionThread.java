package Khorstmann_Key;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExceptionThread implements Runnable {
    @Override
    public void run() {
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        try {
            ExecutorService es = Executors.newCachedThreadPool();
            es.execute(new ExceptionThread());
        }  catch (RuntimeException ess) {
            System.out.println("TEST" + ess);
        }

    }
}
