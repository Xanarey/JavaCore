package Chap18;

import java.io.IOException;

public class ExecDemo {
    public static void main(String[] args) throws IOException {
        Runtime r=  Runtime.getRuntime();
        Process p = null;


        try {
            p = r.exec("Notepad");
        } catch (Exception e) {
            System.out.println("Ошибка запуска NotePad");
        }
    }
}
