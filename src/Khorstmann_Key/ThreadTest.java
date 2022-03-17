package Khorstmann_Key;

import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadTest {

    public static final int DELAY = 10;
    public static final int STEPS = 100;
    public static final double MAX_AMOUNT = 1000;

    public static void main(String[] args) {
        var bank = new Bank(4, 100000);

        Runnable task1 = () -> {
            for (int i = 0; i < STEPS; i++) {
                double amount = MAX_AMOUNT * Math.random();
                bank.transfer(0, 1, amount);
                try {
                    Thread.sleep((long) (DELAY * Math.random()));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable task2 = () -> {
            for (int i = 0; i < STEPS; i++) {
                double amount = MAX_AMOUNT * Math.random();
                bank.transfer(2, 3, amount);
                try {
                    Thread.sleep((long) (DELAY * Math.random()));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        new Thread(task1).start();
        new Thread(task2).start();
    }
}

class Bank {
    private final double[] accounts;
    private Lock bankLock = new ReentrantLock();

    public Bank(int n, double initialBalance) {
        accounts = new double[n];
        Arrays.fill(accounts, initialBalance);
    }

    public void transfer(int from, int to, double amount) {
        bankLock.lock();
        try {
            if (accounts[from] < amount) return;
            System.out.print(Thread.currentThread());
            accounts[from] -= amount;
            System.out.printf(" %10.2f from %d to %d", amount, from, to);
            accounts[to] += amount;
            System.out.printf(" Total Balance: %10.2f%n", getTotalBalance());
        } finally {
            bankLock.unlock();
        }

    }

    public double getTotalBalance() {
        double sum = 0;
        for (double a : accounts)
            sum += a;
        return sum;
    }

    public int size() {
        return accounts.length;
    }
}