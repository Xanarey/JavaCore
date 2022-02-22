package Chap11.Synch.notSynch;

public class CallMe {

    synchronized void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("interrupted: " + e);
        }
        System.out.println("]");
    }

}
