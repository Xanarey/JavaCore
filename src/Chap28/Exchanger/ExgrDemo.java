package Chap28.Exchanger;

import java.util.concurrent.Exchanger;

public class ExgrDemo {

    public static void main(String[] args) {

        Exchanger<String> exgr = new Exchanger<>();

        new Thread(new MakeString(exgr)).start();
        new Thread(new UseString(exgr)).start();


    }
}

class MakeString implements Runnable {

    Exchanger<String> ex;
    String str;

    public MakeString(Exchanger<String> ex) {
        this.ex = ex;
        str = new String();
    }

    @Override
    public void run() {
        char ch = 'A';

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++)
                str += (char)ch++;

            try {
                str = ex.exchange(str);
            } catch (InterruptedException e) {
                System.out.println("int " + e);
            }
        }
    }
}

class UseString implements Runnable {

    Exchanger<String> ex;
    String str;

    public UseString(Exchanger<String> ex) {
        this.ex = ex;
        str = new String();
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                str = ex.exchange(new String());
                System.out.println("Получено: " + str);
            } catch (InterruptedException e) {
                System.out.println("int " + e);
            }
        }
    }
}