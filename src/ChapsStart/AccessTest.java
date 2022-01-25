package ChapsStart;

public class AccessTest {
    public static void main(String[] args) {
        Test2 t2 = new Test2();

        t2.a = 10;
        t2.b = 20;
        t2.setc(30);
        //t3.c = 40;
        System.out.println("a = " + t2.a);
        System.out.println("b = " + t2.b);
        System.out.println("c = " + t2.getc());
    }
}
