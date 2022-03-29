package Khorstmann_Key;

public class Singleton {

    private static Singleton instance;
    private int foo;
    private String bar;

    private Singleton() {
        foo = 7;
        bar = "test";
    }

    public synchronized static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }

}
