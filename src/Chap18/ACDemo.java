package Chap18;

public class ACDemo {
    static byte[] a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74 };
    static byte[] b = {77, 77, 77, 77, 77, 77, 77, 77, 77, 77 };

    public static void main(String[] args) {
        System.out.println("a = " + new String(a));
        System.out.println("b = " + new String(b));
        System.arraycopy(a,0,b,0,b.length);
    }
}
