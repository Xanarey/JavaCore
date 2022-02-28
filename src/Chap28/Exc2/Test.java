package Chap28.Exc2;

public class Test {
    private static int counter;

    public static void test() {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                synchronized (this) {
                    counter = 0;
                    for (int i = 0; i < 5; i++) {
                        counter++;
                        System.out.println(Thread.currentThread().getName() + " : " + counter);
                    }
                }
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();

    }

    public static void main(String[] args) {
        test();
    }
}
