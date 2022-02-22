package Chap11.Synch.SupplierAndConsumer;

public class Producer implements Runnable{
    Q q;

    Producer(Q q) {
        this.q = q;
        new Thread(this, "Поставщик").start();
    }

    @Override
    public void run() {
        int i = 1;
        while (true) {
            q.put(i++);
            if (i == 6)
                System.exit(0);
        }
    }
}
