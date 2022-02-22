package Chap11.Synch.withSynch;

public class Callme {
    void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Прервано " + e);
        }
        System.out.println("]");
    }
}
