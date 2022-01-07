package Chap13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopeFile2 {
    public static void main(String[] args) {

        int i;

        if(args.length != 2) {
            System.out.println("Использование: CopyFile2");
            return;
        }

        try (FileInputStream fin = new FileInputStream(args[0]);
        FileOutputStream fout = new FileOutputStream(args[1])) {

            do {
                i = fin.read();
                if(i != -1) fout.write(i);
            } while (i != -1);
                } catch (IOException e) {
            System.out.println("Error IO: " + e);
        }
    }
}
