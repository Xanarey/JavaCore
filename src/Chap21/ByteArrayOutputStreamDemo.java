package Chap21;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) {
        ByteArrayOutputStream f = new ByteArrayOutputStream();
        String s = "Эти данные будут в массиве бро)";
        byte[] buf = s.getBytes(StandardCharsets.UTF_8);

        try {
            f.write(buf);
        } catch (IOException e) {
            System.out.println(e + " error");
            return;
        }

        System.out.println("Буфер в виде символьной строки");
        System.out.println(f.toString());
        System.out.println("В массив");

        byte[] b = f.toByteArray();
        for (int i = 0; i < b.length; i++)
            System.out.print((char) b[i]);

        System.out.println("\nПоток вывода типа OutputStream() ");

        try (FileOutputStream f2 = new FileOutputStream("test.txt")){
            f.writeTo(f2);
        } catch (IOException e) {
            System.out.print(e + " error write");
            return;
        }

        System.out.println("Установка в исходное состояние");
        f.reset();

        for (int i = 0; i < 3; i++)
            f.write('X');

        System.out.println(f.toString());
    }
}
