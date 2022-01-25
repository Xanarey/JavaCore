package Chap21;

import java.io.*;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        int size;

        try (FileInputStream f = new FileInputStream("C:\\Users\\Пользователь\\Desktop\\JavaCore\\src\\Chap21\\FileInputStreamDemo.java")) {
            System.out.println("Общее количество доступных байтов " + (size = f.available()));
            int n = size / 40;

            System.out.println("Первые " + n + " байтов прочитанных по очереди методоm read()");

            for (int i = 0; i < n; i++)
                System.out.print((char)f.read());

            System.out.println("Доступно: " + f.available());
            System.out.println("Чтение следующих " + n + " байтов по очереди методом read(b[])");

            byte[] b = new byte[n];
            if (f.read(b) != n) {
                System.out.println("Нельзя прочитать " + n + " байтов");
            }

            System.out.println(new String(b, 0 , n));
            System.out.println("\nВсё еще доступно : " + (size = f.available()));
            System.out.println("Пропустить половину оставшихся байтов методов skip()");
            f.skip(size / 2);
            System.out.println("\nВсё еще доступно : " + f.available());
            System.out.println("Чтение " + n/2 + " байтов, размещаемых в конце массива");
            if (f.read(b, n / 2, n / 2) != n / 2)
                System.err.println("Нельзя прочитать " + n / 2 + " байтов");

            System.out.println(new String(b, 0 , b.length));
            System.out.println("\nВсё еще доступно : " + f.available());
        } catch (IOException e) {
            System.out.println(e + " error");
        }

    }
}
