package Chap11.Synch.Flags;

public class SuspendResume {
    public static void main(String[] args) {

        NewThread ob1 = new NewThread("One");
        NewThread ob2 = new NewThread("Two");

        try {
            System.out.println("Состояние One:                  " + ob1.t.getState());

            Thread.sleep(1000);
            System.out.println("Состояние One:                  " + ob1.t.getState());
            ob1.mySuspend();
            System.out.println("Состояние One:                  " + ob1.t.getState());
            System.out.println("Приостановка потока One");
            System.out.println("Состояние One:                  " + ob1.t.getState());

            Thread.sleep(500);
            System.out.println("Состояние One:                  " + ob1.t.getState());
            ob1.myResume();
            System.out.println("Состояние One:                  " + ob1.t.getState());
            System.out.println("Возобновление поток One");
            System.out.println("Состояние One:                  " + ob1.t.getState());

            Thread.sleep(1000);
            System.out.println("Состояние One:                  " + ob1.t.getState());
            ob2.mySuspend();
            System.out.println("Состояние One:                  " + ob1.t.getState());
            System.out.println("Приостановка потока Two");
            System.out.println("Состояние One:                  " + ob1.t.getState());

            Thread.sleep(500);
            System.out.println("Состояние One:                  " + ob1.t.getState());
            ob2.myResume();
            System.out.println("Состояние One:                  " + ob1.t.getState());
            System.out.println("Возобновление поток Two");
            System.out.println("Состояние One:                  " + ob1.t.getState());
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван!");
        }

        try {
            System.out.println("Состояние One:                  " + ob1.t.getState());
            System.out.println("Ожидание завершения потоков");
            ob1.t.join();
            System.out.println("Состояние One:                  " + ob1.t.getState());
            ob2.t.join();
            System.out.println("Состояние One:                  " + ob1.t.getState());
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }

        System.out.println("Главный поток завершен");

    }
}
