package Chap11.Synch.deadlock;

public class Deadlock implements Runnable{
    A a = new A();
    B b = new B();

    Deadlock() {
        Thread.currentThread().setName("General stream");
        Thread t = new Thread(this, "second stream");
        t.start();

        a.foo(b);

        System.out.println("Назад в general stream");
    }

    @Override
    public void run() {
        b.bar(a);

        System.out.println("назад в другой поток");
    }

    public static void main(String[] args) {
        new Deadlock();
    }
}
