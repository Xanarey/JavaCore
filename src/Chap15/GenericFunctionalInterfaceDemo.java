package Chap15;

interface SomeFunc<T> {
    T func(T t);
}

public class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {

        SomeFunc<String> reverse = str -> {
            String result = "";
            int i;

            for(i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);
            return result;
        };

        System.out.println("result str = " + reverse.func("Test"));

        SomeFunc<Integer> fact = n -> {
            int result = 1;
            for(int i = n; i > 0; i--)
                result *= i;
            return result;
        };

        System.out.println("result fact = " + fact.func(5));

    }
}