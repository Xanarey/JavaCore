package Chap28.Exc_1;

public class Exc {

    public static void main(String[] args){
        Foo foo = new Foo();

        foo.second(new Thread());
        foo.first(new Thread());
        foo.third(new Thread());

    }
}

class Foo {

    public void first(Runnable r) {

        System.out.print("first");
    }

    public void second(Runnable r) {

        System.out.print("second");
    }

    public void third(Runnable r) {

        System.out.print("third");
    }
}