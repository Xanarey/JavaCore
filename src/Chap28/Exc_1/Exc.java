package Chap28.Exc_1;

import java.util.concurrent.*;

public class Exc {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Foo foo = new Foo();

        Future<Void> A;
        Future<Void> B;
        Future<Void> C;
    }

}

class Foo {

        Semaphore A = new Semaphore(0);
        Semaphore B = new Semaphore(0);


    public void first (Runnable r) {
        r.run();
        System.out.print("first");
        A.release();
    }
    public void second (Runnable r) {
        r.run();
        try {
            A.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("second");
        B.release();
    }
    public void third (Runnable r) {
        r.run();
        try {
            B.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("third");
        B.release();
    }

}

