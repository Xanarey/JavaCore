package OOP.creational.FactoryMethod2;

import java.util.Date;

public class FactoryMethodApp {
    public static void main(String[] args) {
        WatchFactory watchFactory = new DigitalWatchFactory();
        Watch watch = watchFactory.createWatch();
        watch.showTime();


        WatchFactory watchFactory1 = new RomeWatchFactory();
        Watch watch1 = watchFactory1.createWatch();
        watch1.showTime();

    }
}

interface WatchFactory {
    Watch createWatch();
}

interface Watch {
    void showTime();
}

class DigitalWatchFactory implements WatchFactory {
    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}

class RomeWatchFactory implements WatchFactory {
    @Override
    public Watch createWatch() {
        return new RomeWatch();
    }
}

class DigitalWatch implements Watch{
    @Override
    public void showTime() {
        System.out.println(new Date());
    }
}

class RomeWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println("VII-XX");
    }
}