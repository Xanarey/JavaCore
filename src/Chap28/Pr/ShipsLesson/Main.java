package Chap28.Pr.ShipsLesson;

import Chap28.Pr.ShipsLesson.Types.Type;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Available number of cores: " + Runtime.getRuntime().availableProcessors());

        Tunnel tunnel = new Tunnel();

        ShipGenerator shipGenerator = new ShipGenerator(tunnel, 10);

        PierLoader pierLoader1 = new PierLoader(tunnel, Type.DRESS);
        PierLoader pierLoader2 = new PierLoader(tunnel, Type.MEAL);
        PierLoader pierLoader3 = new PierLoader(tunnel, Type.BANANA);

        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        service.execute(shipGenerator);
        service.execute(pierLoader1);
        service.execute(pierLoader2);
        service.execute(pierLoader3);

        service.shutdown();

    }
}
