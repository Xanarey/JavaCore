package Chap28.Pr.Chicken;

public class EggVoice extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Поток прерван" + e);
            }
            System.out.println("Яицо!");
        }
    }

}

class ChickenVoice {
    static EggVoice mAnotherOpinion;

    public static void main(String[] args) {
        mAnotherOpinion = new EggVoice();
        System.out.println("Спор начат!");
        mAnotherOpinion.start();

        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Поток прерван" + e);
            }
            System.out.println("Курица!");
        }

        if (mAnotherOpinion.isAlive()) {

            try {
                mAnotherOpinion.join();
            } catch (InterruptedException e) {
                System.out.println("поток прерван " + e);
            }
        } else {
            System.out.println("Первой появилась курица!");
        }
        System.out.println("Спор закончен!");
    }
}
