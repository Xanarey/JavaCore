package Khorstmann_Key;

import java.io.BufferedInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.concurrent.*;

class Fu implements Callable<String> {
    private final int count;

    public Fu() {
        count = (int) (Math.random() * 12300);
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(count);
        return "Задача была преостановлена на " + count/1000 + " секунд(ды/у)";
    }
}

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newCachedThreadPool();
        int count = 0;

        Scanner scanner = new Scanner(new InputStreamReader(new BufferedInputStream(System.in)));

        do {
            System.out.print("Введите количество задач: \n");
            count = scanner.nextInt();
        } while (count == 0);

        for (int i = 0; i < count; i++)
            System.out.println(es.submit(new Fu()).get());
        es.shutdown();
    }
}
