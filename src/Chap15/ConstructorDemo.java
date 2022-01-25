package Chap15;

interface MyFunc4 {
    MyClass10 func (int n);
}

class MyClass3 {
    private int val;
    MyClass3(int v) { val = v; }
    MyClass3() {val = 0;}
    int getVal() {return val;}
}

public class ConstructorDemo {
    public static void main(String[] args) {
        MyFunc4 myClassCons = MyClass10::new;
        MyClass10 mc = myClassCons.func(100);
        System.out.println("Значение val в объекте mc = " + mc.getVal());
    }
}