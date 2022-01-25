package ChapsStart;

public class Promote {
    public static void main(String[] args) {
        byte b = 23;
        char c = 'c';
        short s = 1024;
        int i = 50002;
        float f = 5.86f;
        double d = .23213;
        double result  = (b * c) + (c * s) + (i * f * d);

        System.out.println(result);
    }
}
