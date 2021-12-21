package Collections;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Object> hashSet = new HashSet<>();

        System.out.println("Adding element into hashSet: " );
        hashSet.add("Tim");
        hashSet.add("Nik");

        System.out.println("HashSet content: " + hashSet);
    }
}
