package Chap28.Exc_1;

import java.util.concurrent.*;

public class Exc {
    public static void main(String[] args) {

        Thread C = new Thread(Foo::third);
        Thread A = new Thread(Foo::first);
        Thread B = new Thread(Foo::second);

        C.start();
        B.start();
        A.start();
    }

}

class Foo {
    static Semaphore A = new Semaphore(0);
    static Semaphore B = new Semaphore(0);

    public static void first() {

        System.out.print("first");
        A.release();
    }
    public static void second() {

        try {
            A.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("second");
        B.release();
    }
    public static void third() {

        try {
            B.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("third");
        B.release();
    }
}

