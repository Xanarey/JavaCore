package Khorstmann_Key;

public class Singleton {

    private static Singleton instanse;
    private int foo;
    private String bar;

    private Singleton() {
        foo = 7;
        bar = "test";
    }

    public synchronized static Singleton getInstance() {
        if (instanse == null) {
            instanse = new Singleton();
        }
        return instanse;
    }

}
