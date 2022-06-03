package Khorstmann_Key.Generator;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class IntGenerator {
    private volatile boolean canceled = false;
    public abstract int next();

    public void cancel() { canceled = true; }
    public boolean isCanceled() { return canceled; }
}

class EvenChecker implements Runnable {
    private IntGenerator generator;
    private final int id;

    public EvenChecker(IntGenerator g, int ident) {
        generator = g;
        id = ident;
    }

    @Override
    public void run() {
        while (!generator.isCanceled()) {
            int val = generator.next();
            if (val % 2 != 0) {
                System.out.println(val + " not even!");
                generator.cancel();
            }
        }
    }

    public static void test(IntGenerator gp, int count) {
        System.out.println("Press Control-C to exit");

        ExecutorService es = Executors.newCachedThreadPool();
        for (int i = 0; i < count; i++)
            es.execute(new EvenChecker(gp, count));
        es.shutdown();
    }

    public static void test(IntGenerator gp) {
        test(gp, 10);
    }
}

class EventGenerator extends IntGenerator {
    private int currentValue = 0;
    @Override
    public synchronized int next() {
        ++currentValue;
        return currentValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new EventGenerator(), 1000000);
    }
}
