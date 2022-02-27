package Chap28.Pr.Incremenator;

public class Incremenator extends Thread {

    private volatile boolean mIsIncrement = true;

    public void changeAction() {
        mIsIncrement = !mIsIncrement;
    }

    @Override
    public void run() {
        do {

            if (!Thread.interrupted()) {
                if (mIsIncrement) Program.mValue++;
                else Program.mValue--;

                System.out.print(Program.mValue + " ");
            } else {
                return;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("поток прерван " + e);
            }
        } while (true);
    }
}

class Program {
    public static int mValue = 0;
    static Incremenator mInc;

    public static void main(String[] args) {
        mInc = new Incremenator();
        System.out.println("Значение: ");
        mInc.start();

        for (int i = 1; i <= 3; i++) {
            try {
                Thread.sleep(i * 2 * 1000);
            } catch (InterruptedException e) {
                System.out.println("Поток прерван " + e);
            }

            mInc.changeAction();
        }

        mInc.interrupt();
    }
}