package Chap22;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;

public class SelectorDemo {

    public static void main(String[] args) throws IOException {

        Selector selector = Selector.open();
        ServerSocketChannel sch = ServerSocketChannel.open();
        sch.bind(new InetSocketAddress("localhost", 5454));
        sch.configureBlocking(false);

        SelectionKey key = sch.register(selector, SelectionKey.OP_READ);


        ByteBuffer br = ByteBuffer.allocate(256);


    }

}
