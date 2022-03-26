package Khorstmann_Key;

import java.util.ArrayList;
import java.util.concurrent.*;

public class TaskWithResult implements Callable<String> {
    private int id;

    public TaskWithResult(int id) {
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        return "result of TaskWithResult: " + id;
    }
}

class CallableDemo {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        ArrayList<Future<String>> futures = new ArrayList<>();

        for (int i = 0; i < 10; i++)
            futures.add(es.submit(new TaskWithResult(i)));

        for (Future<String> fs : futures) {
            try {
                System.out.println(fs.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            } finally {
                es.shutdown();
            }
        }
    }
}
