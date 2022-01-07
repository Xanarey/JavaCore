package Chap13;

import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) {

        PrintWriter pw = new PrintWriter(System.out, true);

        pw.println("string");
        int i = -7;
        pw.println(i);
        double d = 4.5d - 7;
        pw.println(d);

    }
}
