public class OverloadDemo {
    void test() {
        System.out.println("Параметры отсутствуют");
    }
    void test(int a) {
        System.out.println("a: " + a);
    }
    void test(int a, int b) {
        System.out.println("a: " + a + " |" + " b: " + b);
    }


    void test(double a) {
        System.out.println("Внутреннее преобразование при вызове" +
                " test (double) a: " + a);
    }
}
