package Chap15;



class MyStringOps2 {

    String strReverse(String str) {
        String result = "";
        int i;

        for(i = str.length() - 1; i >= 0; i--)
            result += str.charAt(i);
        return result;
    }
}

public class MethodRefDemo2 {

    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-выражения повышают эффективность Java";
        String outStr;

        MyStringOps2 mso = new MyStringOps2();

        outStr = stringOp(mso::strReverse, inStr);

        System.out.println(inStr);
        System.out.println(outStr);
    }
}
