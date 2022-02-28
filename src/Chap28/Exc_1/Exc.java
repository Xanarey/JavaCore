package Chap28.Exc_1;

import java.util.concurrent.CountDownLatch;

public class Exc {

    public static void main(String[] args) {

        Foo foo = new Foo();
        CountDownLatch countB = new CountDownLatch(1);
        CountDownLatch countA = new CountDownLatch(1);

        Thread A = new Thread(() -> {
            foo.first(Thread.currentThread());
            countA.countDown();
        });

        Thread B = new Thread(() -> {
            try {
                countA.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            foo.second(Thread.currentThread());
            countB.countDown();
        });

        Thread C = new Thread(() -> {
            try {
                countB.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            foo.third(Thread.currentThread());
        });

        C.start();
        B.start();
        A.start();

    }
}

class Foo {

    public void first(Runnable r) {System.out.print("first"); }
    public void second(Runnable r) {System.out.print("second"); }
    public void third(Runnable r) {System.out.print("third"); }

}


//    Дан класс:

//    public class Foo {

//      public void first(Runnable r) { print("first"); }
//      public void second(Runnable r) { print("second"); }
//      public void third(Runnable r) { print("third"); }

//    }
//
//    Один и тот же экземпляр данного класса будет вызван 3-мя разными потоками.
//    Поток А - будет вызывать метод first(). Поток B - second(). Поток С - third().
//    Необходимо реализовать механизм и изменить программу таким образом, что методы класса
//    Foo будут вызваны в правильном порядке.

//    Пример:
//    Вывод: "firstsecondthird"
//    Мы не знаем, в каком порядке будут вызваны методы, но должны гарантировать порядок.

