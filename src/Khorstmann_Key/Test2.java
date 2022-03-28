package Khorstmann_Key;

public class Test2 {
    private static int counter;
    public static void test() {
        Runnable runnable = new Runnable() {
            @Override
            synchronized public void run() {
                counter = 0;
                for (int i = 0; i < 5; i++) {
                    counter += 1;
                    System.out.println(Thread.currentThread().getName() + ": " + counter);
                }
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();
    }

    public static void test2() {
        StringBuffer stringBuilder = new StringBuffer();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                stringBuilder
                        .append("hello world long hello world")
                        .append(Thread.currentThread().getName())
                        .append("\n");
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        Thread thread4 = new Thread(runnable);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }

    public static void main(String[] args) {
        test2();
    }
}
