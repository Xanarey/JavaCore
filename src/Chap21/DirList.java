package Chap21;

import java.io.File;
import java.util.Objects;

public class DirList {
    public static void main(String[] args) {
        String dirname = "/java";
        File file = new File(dirname);

        if(file.isDirectory()) {
            System.out.println("Package = " + dirname);
            String[] s = file.list();

            for(int i = 0; i < Objects.requireNonNull(s).length; i++) {
                File f = new File(dirname + "/" + s[i]);
                if(f.isDirectory()) {
                    System.out.println(s[i] + " package");
                } else {
                    System.out.println(s[i] + " file");
                }
            }
        } else {
            System.out.println(dirname + " not package");
        }

    }
}
