package Chap28.Pr;

class Program {

    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello, this is" +
                        "second thread!");
            }
        });
        thread.start();

        System.out.println("главный поток завершен");

        new Thread(new AffableThread()).start();
    }
}

class AffableThread extends Thread {
    @Override
    public void run() {
        System.out.println("TEST");
    }
}