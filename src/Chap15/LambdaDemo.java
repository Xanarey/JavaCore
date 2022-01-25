package Chap15;

interface MyNumber {
    double getValue();
}

interface NumericTest {
    boolean test(int n);
}

interface NumericTest2 {
    boolean test(int n, int d);
}

interface NumericFunc {
    int func(int n);
}

public class LambdaDemo {
    public static void main(String[] args) {

        NumericFunc factorial = n -> {
            int result = 1;

            for(int i = 1; i <= n; i++)
                result = i * result;
            return result;
        };

        System.out.println("Result fact - 5: " + factorial.func(5));
        System.out.println("Result fact - 4: " + factorial.func(4));

        MyNumber myNum;

        myNum = () -> 123.45;
        System.out.println(myNum.getValue());

        myNum = () -> Math.random() * 100;
        System.out.println(myNum.getValue());
        System.out.println(myNum.getValue());
        System.out.println(myNum.getValue());

        //myNum = () -> "ChapsStart.Test";
        System.out.println(myNum.getValue());

        NumericTest isEven = (n) -> (n % 2) == 0;

        if(isEven.test(5))
            System.out.println("5 - even value");
        if(!isEven.test(5))
            System.out.println("5 - odd value");

        System.out.println("TEST: " + myNum.getValue());

        NumericTest2 isFactor = (n, d) -> (n % d) == 0;

        if(isFactor.test(10, 2))
            System.out.println("Число 2 является множителем числа 10");

        if(!isFactor.test(10, 3))
            System.out.println("Число 3 не является множителем числа 10");
    }
}



