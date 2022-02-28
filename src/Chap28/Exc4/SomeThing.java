package Chap28.Exc4;

class Program {

    public static void main(String[] args) {

        System.out.println("Спор начат!");

        Thread eggVoice = new EggVoice();
        eggVoice.start();

        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Курица");
        }

        if (Thread.currentThread().isAlive()) {
            try {
                eggVoice.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Куриный поток заканчивается последним!");
        }


        System.out.println("General thread is finish");
    }

}

class AffableThread extends Thread {
    @Override
    public void run() {
        System.out.println("Привет из другого побочного потока");
    }
}

class EggVoice extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Яйцо");
        }
    }
}