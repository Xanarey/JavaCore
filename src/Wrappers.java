import java.util.Arrays;

public class Wrappers {
    public static void main(String[] args) {

        Double d = new Double(2.2);
        Boolean b = new Boolean(false);

        System.out.println("=============");
        Integer a = 20;
        int bc = 21;
        int bx = 22;
        Byte p1 = -122;

        byte px = -120;
        byte pe = 119;

        Byte p2 = 122;
        System.out.println(Integer.hashCode(a));
        System.out.println(a.hashCode());
        System.out.println("=============");


        int n = 7;
        Integer y = 8;
        //n = y;
        System.out.println(n);
        System.out.println(y);
        y = n * 100;
        System.out.println(n);
        System.out.println(y);




        Integer i = new Integer(100);
        String q = i.toString();
        System.out.println(q + q);


        String p = "2184721";
        Integer po = Integer.parseInt(p);
        System.out.println(po + po);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.reverseBytes(1112000000));

       // Integer as = 10;
        Integer[] asdd = {2,3,8,5,1};
        System.out.println(asdd[0]);
        Arrays.stream(asdd).sorted();
        System.out.println(asdd[0]);
        printNumber(new Integer(10));
    }

    public static void printNumber(Integer i) {
        System.out.println("Вы ввели число: " + i);
    }

    public static void printNumber(int i) {
        System.out.println("Вы ввели число: " + i);
    }
}
