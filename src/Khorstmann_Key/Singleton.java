package Khorstmann_Key;

public class Singleton {

    private static volatile Singleton instance;
    private int foo;
    private String bar;

    private Singleton() {
        foo = 7;
        bar = "test";
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null)
                    instance = new Singleton();
            }
        }
        return instance;
    }

}
