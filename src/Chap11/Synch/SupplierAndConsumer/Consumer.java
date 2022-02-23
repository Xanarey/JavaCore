package Chap11.Synch.SupplierAndConsumer;

public class Consumer implements Runnable{
    Q q;

    Consumer(Q q) {
        this.q = q;
        new Thread(this, "Потребитель");
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++)
            q.get();
    }
}
