package Chap11;

import java.util.ArrayList;
import java.util.concurrent.*;

public class ExgrDemo {

    private static final Exchanger<String> EXCHANGER = new Exchanger<>();

    public static void main(String[] args) {
        String[] p1 = new String[]{"{посылка A->D}", "{посылка A->C}"};
        String[] p2 = new String[]{"{посылка B->C}", "{посылка B->D}"};

        new Thread(new Truck(1, "A", "D", p1)).start();
        new Thread(new Truck(2, "B", "C", p2)).start();
    }

    public static class Truck implements Runnable {
        private int number;
        private String dep;
        private String dest;
        private String[] parcels;

        public Truck(int number, String dep, String dest, String[] parcels) {
            this.number = number;
            this.dep = dep;
            this.dest = dest;
            this.parcels = parcels;
        }

        @Override
        public void run() {
            try {
                System.out.printf("Грузовик №%d выехал из пункта %s в пункт %s.\n", number, dep, dest);
                System.out.printf("В грузовик №%d погрузили: %s и %s.\n", number, parcels[0], parcels[1]);
                Thread.sleep(1000);
                System.out.printf("Грузовик №%d приехал в пункт Е.\n", number);
                parcels[1] = EXCHANGER.exchange(parcels[1]);
                System.out.printf("В грузовик №%d переместили посылку для пункта %s.\n", number, dest);
                Thread.sleep(1000 + (long) (Math.random() * 5000));
                System.out.printf("Грузовик №%d приехал в %s и доставил: %s и %s.\n", number, dest, parcels[0], parcels[1]);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Bus {
    private static final Phaser PHASER = new Phaser(1);

    public static void main(String[] args) {
        ArrayList<Passenger> passengers = new ArrayList<>();

        for (int i = 1; i < 5; i++) {           //Сгенерируем пассажиров на остановках
            if ((int) (Math.random() * 2) > 0)
                passengers.add(new Passenger(i, i + 1));//Этот пассажир выходит на следующей

            if ((int) (Math.random() * 2) > 0)
                passengers.add(new Passenger(i, 5));    //Этот пассажир выходит на конечной
        }

        for (int i = 0; i < 7; i++) {
            switch (i) {
                case 0:
                    System.out.println("Автобус выехал из парка.");
                    PHASER.arrive();//В фазе 0 всего 1 участник - автобус
                    break;
                case 6:
                    System.out.println("Автобус уехал в парк.");
                    PHASER.arriveAndDeregister();//Снимаем главный поток, ломаем барьер
                    break;
                default:
                    int currentBusStop = PHASER.getPhase();
                    System.out.println("Остановка № " + currentBusStop);

                    for (Passenger p : passengers)          //Проверяем, есть ли пассажиры на остановке
                        if (p.departure == currentBusStop) {
                            PHASER.register();//Регистрируем поток, который будет участвовать в фазах
                            p.start();        // и запускаем
                        }

                    PHASER.arriveAndAwaitAdvance();//Сообщаем о своей готовности
            }
        }
    }

    public static class Passenger extends Thread {
        private int departure;
        private int destination;

        public Passenger(int departure, int destination) {
            this.departure = departure;
            this.destination = destination;
            System.out.println(this + " ждёт на остановке № " + this.departure);
        }

        @Override
        public void run() {

            try {
                System.out.println(this + " сел в автобус.");

                while (PHASER.getPhase() < destination)
                    PHASER.arriveAndAwaitAdvance();

                Thread.sleep(1);
                System.out.println(this + " покинул автобус.");
                PHASER.arriveAndDeregister();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @Override
        public String toString() {
            return "Пассажир{" + departure + " -> " + destination + '}';
        }
    }
}

class SimpleExec {
    public static void main(String[] args) {
        CountDownLatch count1 = new CountDownLatch(5);
        CountDownLatch count2 = new CountDownLatch(5);
        CountDownLatch count3 = new CountDownLatch(5);
        CountDownLatch count4 = new CountDownLatch(5);
        ExecutorService es = Executors.newFixedThreadPool(2);

        System.out.println("Запуск потоков");

        es.execute(new MyThread3(count1, "A"));
        es.execute(new MyThread3(count2, "B"));
        es.execute(new MyThread3(count3, "C"));
        es.execute(new MyThread3(count4, "D"));

        try {
            count1.await();
            count2.await();
            count3.await();
            count4.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        es.shutdown();
        System.out.println("Завершение потоков");
    }
}

class MyThread3 implements Runnable {
    String name;
    CountDownLatch count;

    public MyThread3(CountDownLatch count, String name) {
        this.name = name;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + " : " + i);
            count.countDown();
        }
    }
}

class CallableDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<Integer> f;
        Future<Double> f2;
        Future<Integer> f3;

        System.out.println("Start");

        f = executorService.submit(new Sum(5));
        f2 = executorService.submit(new Hypot(3, 4));
        f3 = executorService.submit(new Factorial(5));

        try {
            System.out.println(f.get());
            System.out.println(f2.get());
            System.out.println(f3.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        executorService.shutdown();
        System.out.println("Finish");
    }
}

class Sum implements Callable<Integer> {
    int stop;

    public Sum(int stop) {
        this.stop = stop;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= stop; i++)
            sum += i;
        return sum;
    }
}

class Hypot implements Callable<Double> {
    double side1, side2;

    public Hypot(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public Double call() throws Exception {
        return Math.sqrt((side1 * side1) + (side2 * side2));
    }
}

class Factorial implements Callable<Integer> {
    int stop;

    public Factorial(int stop) {
        this.stop = stop;
    }

    @Override
    public Integer call() throws Exception {
        int fact = 1;
        for (int i = 2; i <= stop; i++)
            fact *= 1;
        return fact;
    }
}






































