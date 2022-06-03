package Chap28.Callable_and_Future;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class HelloWorld {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

//        Callable task = () -> {
//            return "Hello, World!";
//        };
//
//        FutureTask<String> futureTask = new FutureTask<>(task);
//        new Thread(futureTask).start();
//        System.out.print(futureTask.get());

        CompletableFuture<String> completed;
        completed = CompletableFuture.completedFuture("Value");
        System.out.println(completed.get());

        CompletableFuture<Void> voidCompletableFuture;
        voidCompletableFuture = CompletableFuture.runAsync(() -> {
            System.out.print("run " + Thread.currentThread().getName());
        });
        System.out.print(voidCompletableFuture.get());
    }
}
