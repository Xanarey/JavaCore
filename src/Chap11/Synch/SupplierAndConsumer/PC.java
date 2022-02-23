package Chap11.Synch.SupplierAndConsumer;

public class PC {
    public static void main(String[] args) {
        Q q = new Q();

        new Thread(new Consumer(q), "Consumer").start();
        new Thread(new Producer(q), "Producer").start();


        System.out.println("Для остановки нажмите Ctrl + C.");
    }
}
