package Chap21;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        String source = "Lorem ipsum dolor sit amet, " +
                "consectetur adipiscing elit, sed do " +
                "eiusmod tempor incididunt ut labore et " +
                "dolore magna aliqua. Ut enim ad minim veniam, " +
                "quis nostrud exercitation ullamco laboris nisi " +
                "ut aliquip ex ea commodo consequat. Duis aute " +
                "irure dolor in reprehenderit in voluptate velit " +
                "esse cillum dolore eu fugiat nulla pariatur.";

        char[] buffer = new char[source.length()];
        source.getChars(0, source.length(), buffer, 0);

        try ( FileWriter f0 = new FileWriter("file1.txt");
              FileWriter f1 = new FileWriter("file2.txt");
              FileWriter f2 = new FileWriter("file3.txt"))
        {
            for (int i = 0; i < buffer.length; i += 2)
                f0.write(buffer[i]);

            f1.write(buffer);

            f2.write(buffer, buffer.length - buffer.length / 4, buffer.length / 4);
        } catch (IOException e) {
            System.out.println("Error IO " + e);
        }
    }
}
