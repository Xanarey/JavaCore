package Collections;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Object> treeSet = new TreeSet<>();

        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(5);
        treeSet.add(4);

        System.out.println(treeSet);
    }
}
