package Chap13;

import java.io.*;

public class TryWithResources {

    static class MyClass implements AutoCloseable {
        @Override
        public void close(){

        }
    }

    public static void main(String[] args) {



        try (Reader ignored = new FileReader("someFileName");
             MyClass myClass = new MyClass()){
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
