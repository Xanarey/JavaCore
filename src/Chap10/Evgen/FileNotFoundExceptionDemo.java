package Chap10.Evgen;

import java.io.FileReader;

public class FileNotFoundExceptionDemo {
    public static void main(String[] args) {



        try (FileReader fr = new FileReader("txt.txt")) {

            char[] chars = new char[100];
            fr.read(chars);

            for (char c : chars)
                System.out.println(c);

        } catch (Exception e) {
            System.out.println("File no found : " + e);
        }
        mA();

    }
    static void mA() {
        mB();
    }
    static void mB() {
        mA();
    }
}
