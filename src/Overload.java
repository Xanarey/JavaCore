public class Overload {
    public static void main(String[] args) {
        OverloadDemo od = new OverloadDemo();
        double result;
        int i = 90;
        od.test();
        od.test(10);
        od.test(10,20);
        od.test(90);
        od.test(123.25);
        System.out.println(
                "Результат вызова ob.test(123.25): "
        );
    }
}
