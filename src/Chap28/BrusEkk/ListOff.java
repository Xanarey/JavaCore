package Chap28.BrusEkk;

public class ListOff implements Runnable{

    protected int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;

    public ListOff() {}

    public ListOff(int countDown) {
        this.countDown = countDown;
    }

    public String status() {
        return "#" + id + "(" +
                (countDown > 0 ? countDown : "Listoff!") + "), \n";
    }

    @Override
    public void run() {
        while (countDown-- > 0) {
            System.out.print(status());
            Thread.yield();
        }
    }
}

class MainThread {
    public static void main(String[] args) throws InterruptedException {

//        for (int i = 0; i < 5; i++)
//            new Thread(new ListOff()).start();
//        System.out.println("Waiting for ListOff");

        Thread a = new Thread(new Test(0));
        a.start();
        Thread b = new Thread(new Test(3));
        b.start();
        Thread c = new Thread(new Test(6));
        c.start();

        a.join();
        b.join();
        c.join();
        System.out.println("Finish!");



    }
}

class Test implements Runnable {
    private int count = 0;
    private Thread t;

    public Test(int count) {
        System.out.println("Start!");
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            count++;
            System.out.println("TEST " + count);
            Thread.yield();
        }

    }

}