package Chap21;

import java.io.*;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        int size;

        try (FileInputStream f = new FileInputStream("C:\\Users\\Пользователь\\Desktop\\JavaCore\\src\\Chap21\\FileInputStreamDemo.java")) {
            System.out.println("Общее количество доступных байтов " + (size = f.available()));
            int n = size / 40;

            System.out.println("Первые " + n + " байтов прочитанных по очереди");

            for (int i = 0; i < n; i++)
                System.out.print((char)f.read());
        } catch (IOException e) {
            System.out.println(e + " error");
        }

    }
}
