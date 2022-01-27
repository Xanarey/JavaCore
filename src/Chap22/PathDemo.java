package Chap22;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class PathDemo {
    public static void main(String[] args) {
        Path filepath = Paths.get("example\\test.txt");

        System.out.println("FileName " + filepath.getName(1));
        System.out.println("PathName " + filepath);
        System.out.println("AbsPath " + filepath.toAbsolutePath());

        Files.isWritable(filepath);
        System.out.println("Файл доступен для записи");

        Files.isReadable(filepath);
        System.out.println("Файл доступен для чтения");


//        try (BasicFileAttributes bfa = Files.readAttributes(filepath, BasicFileAttributes.class))
//        {
//            System.out.println("Время последней модификации: " + bfa.lastModifiedTime());
//        } catch (IOException e) {
//            System.out.println("Error IO " + e);
//        }
    }
}
