package Chap13;

public class MyClass {
    int a;
    int b;

    MyClass(int i, int j) {
        a = i;
        b = j;
    }

    MyClass(int i) {
        this(i, i);
    }

    MyClass() {
        this(0);
    }

    public static void main(String[] args) {

        MyClass mc = new MyClass(5);
        MyClass mc2 = new MyClass();

    }
}
