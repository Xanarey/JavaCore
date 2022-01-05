package Chap18;

public class StringConversions {
    public static void main(String[] args) {
        int num = 123412;
        System.out.println("Число " + num + "в двоичной форме: " +
                Integer.toBinaryString(num));
        System.out.println("Число " + num + "в восьмеричной форме: " +
                Integer.toOctalString(num));
        System.out.println("Число " + num + "в hex форме: " +
                Integer.toHexString(num));
    }
}
