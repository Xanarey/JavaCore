package Chap11.Synch.deadlock;

public class A {
    synchronized void foo(B b) {
        String name = Thread.currentThread().getName();

        System.out.println(name + " вошел в метод А.foo()");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Клас A прерван");
        }
        System.out.println(name +
                " пытается вызвать метод В.last()");
        b.last();
    }

    synchronized void last() {
        System.out.println("В методе A.last()");
    }
}
