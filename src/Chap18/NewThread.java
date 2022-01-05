package Chap18;

public class NewThread extends Thread{
    boolean suspendFlag;

    NewThread(String threadtime, ThreadGroup tgOb) {
        super(tgOb, threadtime);
        System.out.println("New thread: " + this);
        suspendFlag = false;
        start();
    }

    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println(getName() + ": " + i);
                Thread.sleep(1000);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Исключение в " + getName());
        }
        System.out.println(getName() + " end!");
    }

    synchronized void mysyspend() {
        suspendFlag = true;
    }

    synchronized void myresume() {
        suspendFlag = false;
        notify();
    }
}

class ThreadGroupDemo {
    public static void main(String[] args) {
        ThreadGroup groupA = new ThreadGroup("Group A");
        ThreadGroup groupB = new ThreadGroup("Group B");

        NewThread ob1 = new NewThread("One", groupA);
        NewThread ob2 = new NewThread("Two", groupA);
        NewThread ob3 = new NewThread("Three", groupB);
        NewThread ob4 = new NewThread("Four", groupB);

        System.out.println("\nВывод из метода list(): ");
        groupA.list();
        groupB.list();
        System.out.println();

        System.out.println("Прерывается GroupA");
        Thread[] tga = new Thread[groupA.activeCount()];
        groupA.enumerate(tga);
        for (Thread thread : tga) {
            ((NewThread) thread).mysyspend();
        }

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }

        System.out.println("Возобновление GroupA");

        for (Thread thread : tga) {
            ((NewThread) thread).myresume();
        }

        try {
            System.out.println(
                    "Ожидание потоков исполнения."
            );
            ob1.join();
            ob2.join();
            ob3.join();
            ob4.join();
        } catch (Exception e) {
            System.out.println("Исключения в главном потоке исполнения");
        }
        System.out.println("Главный поток исполнения завершен!!!!!!!!");
    }
}
