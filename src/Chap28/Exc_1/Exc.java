package Chap28.Exc_1;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Semaphore;

public class Exc {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Foo foo = new Foo();



    }
}

class Foo {

    private Semaphore s1 = new Semaphore(0);
    private Semaphore s2 = new Semaphore(0);

    public Foo() {

    }

    public void first(Runnable r) throws InterruptedException {

        r.run();
        System.out.print("first");
        s1.release();
    }

    public void second(Runnable r) throws InterruptedException {
        s1.acquire();

        r.run();
        System.out.print("second");
        s2.release();
    }

    public void third(Runnable r) throws InterruptedException {
        s2.acquire();

        r.run();
        System.out.print("third");
        s2.release();
    }
}

