package Chap22;


import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {
    public static void main(String[] args) {

        int count = 0;
        Path filePath = null;

        try {
            filePath = Paths.get("src/test.txt");
        } catch (InvalidPathException e) {
            System.out.println("file not found : " + e);
        }

        try (SeekableByteChannel sk = Files.newByteChannel(filePath)) {

            ByteBuffer br = ByteBuffer.allocate(128);

            do {

                count = sk.read(br);

                if (count != -1)
                    br.rewind();

                for (int i = 0; i < count; i++)
                    System.out.print((char)br.get());

            } while (count != -1);



        } catch (IOException e) {
            System.out.println("IO error ; " + e);
        }

    }
}
