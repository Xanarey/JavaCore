package Chap11;

import java.util.ArrayList;
import java.util.concurrent.Exchanger;
import java.util.concurrent.Phaser;

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











































