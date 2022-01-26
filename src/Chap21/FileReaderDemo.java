package Chap21;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {

        try (FileReader fileReader = new FileReader("C:\\Users\\Пользователь\\Desktop\\JavaCore\\src\\Chap21\\FileReaderDemo.java")) {
            int c;

            while ((c = fileReader.read()) != -1)
                System.out.print((char) c);
        } catch (IOException e) {
            System.out.println("ERROR " + e);
        }

    }
}
