package Chap11;

public class Exc1 {
    public static void main(String[] args) {
        Foo B = new Foo("B");
        Foo C = new Foo("C");
        Foo A = new Foo("A");
    }
}

class Foo implements Runnable {
    String name;
    Thread t;

    Foo(String a) {
        name = a;
        t = new Thread(this, name);
        System.out.println("Thread: " + t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                Thread.sleep(1000);
                System.out.println(t.getName() + " " + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t.getName() + " завершен");
    }
}