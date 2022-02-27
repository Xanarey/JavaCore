package Chap28.Pr.ShipsLesson;

import Chap28.Pr.ShipsLesson.Ships.Ship;
import Chap28.Pr.ShipsLesson.Types.Size;
import Chap28.Pr.ShipsLesson.Types.Type;

import java.util.Random;

public class ShipGenerator implements Runnable{
    private Tunnel tunnel;
    private int shipCount;

    public ShipGenerator(Tunnel tunnel, int shipCount) {
        this.tunnel = tunnel;
        this.shipCount = shipCount;
    }

    @Override
    public void run() {
        int count  = 0;
        while (count < shipCount) {
            Thread.currentThread().setName("Generatot ship");
            count++;
            tunnel.add(new Ship(getRandomSize(), getRandomType()));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Поток прерван " + e);
            }
        }
    }

    private Size getRandomSize() {
        Random random = new Random();
        return Size.values()[random.nextInt(Size.values().length)];
    }

    private Type getRandomType() {
        Random random = new Random();
        return Type.values()[random.nextInt(Type.values().length)];
    }
}
