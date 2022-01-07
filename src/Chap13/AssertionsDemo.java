package Chap13;

public class AssertionsDemo {

    public static void main(String[] args) {
        new AssertionsDemo().someMethod(-5);
    }

    private void someMethod(int a) {
        assert (a > 0);

        System.out.println(a);
    }

}
