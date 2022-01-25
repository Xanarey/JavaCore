package Chap20;

import java.util.*;
class MyTimerTask extends TimerTask {
    public void run() {
        System.out.println("Задание по таймеру.");
    }
}

public class TTest {
    public static void main(String[] args) {
        MyTimerTask mtt = new MyTimerTask();
        Timer myTimer = new Timer();

        myTimer.schedule(mtt, 1000, 500);

        try{
            Thread.sleep(5000);
        } catch (InterruptedException exc) {}

        myTimer.cancel();
    }
}
