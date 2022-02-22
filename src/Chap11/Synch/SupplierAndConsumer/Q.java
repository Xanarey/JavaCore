package Chap11.Synch.SupplierAndConsumer;

public class Q {
    int n;
    boolean valueSet = false;

    synchronized int get() {

        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(" перехват " + e);
            }
        }

        System.out.println("получено : " + n);

        valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n) {

        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("перехват " + e);
            }
        }

        this.n = n;
        valueSet = true;
        System.out.println("отправлено : " + n);
        notify();
    }
}

