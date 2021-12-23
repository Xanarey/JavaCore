package Collections;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        IdentityHashMap<Object, String > identityHashMap = new IdentityHashMap<>();

        identityHashMap.put(5,"Test0");
        identityHashMap.put(8,"Test3");
        identityHashMap.put(6,"Test1");
        identityHashMap.put(9,"Test4");
        identityHashMap.put(7,"Test2");

        System.out.println("TEST: ");

        Set<Map.Entry<Object, String>> set = identityHashMap.entrySet();

        for (Object element: set) {
            Map.Entry mapEntry = (Map.Entry) element;
            System.out.println("Content: " + mapEntry.getKey() + " | " + mapEntry.getValue());
        }

        System.out.println("======================");
        //set = identityHashMap.entrySet();  Todo ЗАЧЕМ ?
        String name = identityHashMap.get(5);
        name += " TEST";
        identityHashMap.put(5, name);

        for (Object element: set) {
            Map.Entry mapEntry = (Map.Entry) element;
            System.out.println("Content 2: " + mapEntry.getKey() + " | " + mapEntry.getValue());
        }

    }
}
