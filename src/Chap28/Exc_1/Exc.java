package Chap28.Exc_1;

public class Exc {
    public static void main(String[] args) throws InterruptedException {
        Foo foo = new Foo();

        Thread A = new Thread();
        A.start();
        Thread B = new Thread();
        B.start();
        Thread C = new Thread();
        C.start();

        foo.first(A);
        foo.third(C);
        foo.second(B);

    }
}

class Foo {
    public int count;

    public Foo() {
        this.count = 1;
    }

    synchronized public void first(Runnable r)  {
        while (count != 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        r.run();
        count++;
        System.out.println("first");
        System.out.println(r);
        notifyAll();
    }

    synchronized public void second(Runnable r)  {
        while (count != 2) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        r.run();
        count++;
        System.out.println("second");
        System.out.println(r);
        notifyAll();
    }

    synchronized public void third(Runnable r)  {
        while (count != 3) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        r.run();
        System.out.println("third");
        System.out.println(r);
        notifyAll();
    }
}

