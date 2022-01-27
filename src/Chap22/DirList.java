package Chap22;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class DirList {
    public static void main(String[] args) {
        String dirname = "\\MyDir";

        try (DirectoryStream<Path> dirstrm = Files.newDirectoryStream(Paths.get(dirname)))
        {
            System.out.println("Каталог : " + dirname);

            for (Path entry : dirstrm) {
                BasicFileAttributes attributes = Files.readAttributes(
                        entry, BasicFileAttributes.class);

                if (attributes.isDirectory())
                    System.out.print("<DIR> ");
                else
                    System.out.print("      ");

                System.out.println(entry.getName(1));
            }
        } catch (InvalidPathException e) {
            System.out.println("Er" + e);
        } catch (NotDirectoryException e) {
            System.out.println("ErDir " + e);
        } catch (IOException e) {
            System.out.println("Error IO " + e);
        }
    }
}
