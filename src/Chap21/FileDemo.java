package Chap21;

import java.io.File;

public class FileDemo {

    static void p(String e) {
        System.out.println(e);
    }

    public static void main(String[] args) {
        File file = new File("/java/COPYRIGHT");
        p("File name = " + file.getName());
        p("Path = " + file.getPath());
        p("AbsPath = " + file.getAbsolutePath());
        p("Parent = " + file.getParentFile());
        p("Exists > " + file.exists());

        p("canWrite ? = " + file.canWrite());
        p("canRead ?  = " + file.canRead());
        p("isDirectory ?  = " + file.isDirectory());
        p("isFile ? = " + file.isFile());
        p("isAbs ?  = " + file.isAbsolute());
        p("size  = " + file.length());
    }

}
