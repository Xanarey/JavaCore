package Chap18;

public class IsDemo {
    public static void main(String[] args) {
        char[] a = {'a','b','5'};

        for (char c : a) {
            if (Character.isDigit(c))
                System.out.println(c + " - цифра ");
            if (Character.isLetter(c))
                System.out.println(c + " - буква ");
        }
    }
}
