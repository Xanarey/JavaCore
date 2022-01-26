package Chap29;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

public class StreamDemoIter {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();

        myList.add ("Альфа");
        myList.add("Бeтa");
        myList.add ("Гамма");
        myList.add ("Дельта");
        myList.add( "Кси");
        myList.add ("Омега");

        Stream<String> myStream = myList.stream();

        Iterator<String> itr = myStream.iterator();

        while (itr.hasNext())
            System.out.println(itr.next());
    }
}
