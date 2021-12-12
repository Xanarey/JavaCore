interface A10 {
    void meth1();
    void meth2();
    default void methS() {
        System.out.println("default");
    }
}

interface B10 extends A10 {
    void meth3();
}

class MyClass implements B10 {

    public void meth1() {
        System.out.println("Реализация метода 1");
    }

    public void meth2() {
        System.out.println("Реализация метода 2");
    }

    public void meth3() {
        System.out.println("Реализация метода 3");
    }

    public void methS() {
        B10.super.methS();
    }
}

class IFExtend {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.meth1();
        myClass.meth2();
        myClass.meth3();
        myClass.methS();
    }
}