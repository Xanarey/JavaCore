package Collections;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Object> linkedList = new LinkedList<>();

        System.out.println("Adding elements to lL...");

        linkedList.add("asi");
        linkedList.add("asi1");
        linkedList.add("asi2");
        linkedList.add("asi3");

        System.out.println(linkedList);
        System.out.println(linkedList.size());

        linkedList.remove(3);


        System.out.println(linkedList);

        linkedList.set(2,"asi1.2");
        linkedList.add("asi");
        linkedList.add("asi3");

        System.out.println(linkedList);
    }
}
