package ChapsStart;

abstract class A8 {

    abstract void callme();

    void callmetoo() {
        System.out.println("Конкретный метод");
    }
}

class B8 extends A8 {

    void callme() {
        System.out.println("Реализация метода callme() в классе В");
    }
}

class AbstractDemo {
    public static void main(String[] args) {
        B8 b8 = new B8();

        b8.callme();
        b8.callmetoo();
    }
}