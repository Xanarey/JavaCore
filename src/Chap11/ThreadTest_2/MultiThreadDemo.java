package Chap11.ThreadTest_2;

public class MultiThreadDemo {
    public static void main(String[] args) {
        NewThread one = new NewThread("One");
        NewThread two = new NewThread("Two");
        NewThread three = new NewThread("Three");

        System.out.println("Поток " + one + one.t.isAlive() + " запущен");
        System.out.println("Поток " + two + two.t.isAlive() + " запущен");
        System.out.println("Поток " + three + three.t.isAlive() + " запущен");

        try {
            one.t.join();
            two.t.join();
            three.t.join();
        } catch (InterruptedException e) {
            System.out.println("главный поток прерван");
        }

        System.out.println("Поток " + one + one.t.isAlive() + " запущен");
        System.out.println("Поток " + two + two.t.isAlive() + " запущен");
        System.out.println("Поток " + three + three.t.isAlive() + " запущен");
        System.out.println("главный поток завершен");


    }
}
