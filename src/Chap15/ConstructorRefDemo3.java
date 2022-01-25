package Chap15;

interface MyFunc10<R, T> {
    R func(T n);
}

class MyClass10<T> {
    private T val;
    MyClass10(T v) { val = v;}

}

class MyClass2 {
    String str;
    MyClass2(String s) { str = s;}

}

public class ConstructorRefDemo3 {
    static <R, T> R myClassFactory(MyFunc10<R, T> cons, T v) {
        return cons.func(v);
    }
    public static void main(String[] args) {
        MyFunc10<MyClass10<Double>, Double> myClassCons = MyClass10<Double>::new;
        MyClass10<Double> mc = myClassFactory(myClassCons, 100.1);
        MyFunc10<MyClass2, String> myclassCons2 = MyClass2::new;
        MyClass2 mc2 = myClassFactory(myclassCons2, "Лямбда");
    }
}
