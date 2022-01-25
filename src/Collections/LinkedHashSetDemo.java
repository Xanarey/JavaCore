package Collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Object> linkedHashSet = new LinkedHashSet<>();

        System.out.println("Adding: ");
        linkedHashSet.add("ChapsStart.Test");
        linkedHashSet.add(1);

        System.out.println("Content: " + linkedHashSet);
    }
}
