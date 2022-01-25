package Chap15;

interface MyFunc {
    int func(int n);
}
public class VarCapture {
    public static void main(String[] args) {

        int num = 10;

        MyFunc10 myL = n -> {

            int v = num + n;
            //num++; был осуществлен захват переменной

            return v;

        };
        System.out.println("Return: " + myL.func(3));
    }
}