package Chap15;



public class Lambda {

    public static void main(String[] args) {
        ISum sum = new ISum() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };

        ISum sum2 = (a, b) -> a * b;
    }

    @FunctionalInterface
    public interface ISum {

        int sum(int a, int b);

    }
}

