package Khorstmann_Key;

public class Account {
    private long balance;

    public Account() { this(0L); }

    public Account(long balance) { this.balance = balance;}

    public long getBalance() { return balance; }

    public synchronized void deposit(long amount) {
        checkAmountNonNegative(amount);
        balance += amount;
        notifyAll();
    }

    public synchronized void withdraw(long amount) {
        checkAmountNonNegative(amount);
            if (balance < amount) {
                throw new IllegalArgumentException("not enough money");
            }
            balance -= amount;
    }

    public synchronized void waitAndWithdraw(long amount) throws InterruptedException {
        checkAmountNonNegative(amount);
        while (balance < amount) {
        }
        balance -= amount;
    }

    private static void checkAmountNonNegative(long amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("negative amount");
        }
    }
}

class Demo3 {
    public static void main(String[] args) throws InterruptedException {
        Account account = new Account(0);
        System.out.println("Begin balance = " + account.getBalance());
        new DepositThread(account).start();

        account.waitAndWithdraw(50_000_000);
        System.out.println("Total balance = " + account.getBalance());

        System.out.println("End balance = " + account.getBalance());
    }

    private static class WithdrawThread extends Thread {
        private final Account account;

        public WithdrawThread(Account account) {
            this.account = account;
        }

        @Override
        public void run() {
            for (int i = 0; i < 50_000_000; i++)
                account.withdraw(1);
        }
    }

    private static class DepositThread extends Thread {
        private final Account account;

        public DepositThread(Account account) {
            this.account = account;
        }

        @Override
        public void run() {
            for (int i = 0; i < 50_000_000; ++i)
                account.deposit(1);
        }
    }
}