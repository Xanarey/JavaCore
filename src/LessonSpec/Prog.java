package LessonSpec;

import java.util.stream.Stream;

public class Prog {

    public static void fire(Object sender) {
        System.out.println("FIRE !!!!");
    }

    public static void main(String[] args) {
        Switcher sw = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        sw.addElectricityListener(lamp);
        sw.addElectricityListener(radio);

        String message = "Pojar";

        sw.addElectricityListener(n -> System.out.println(message));
        sw.addElectricityListener(Prog::fire);
        sw.switchOn();
    }

}
