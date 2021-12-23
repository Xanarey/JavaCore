package Collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Object, String> linkedHashMap = new LinkedHashMap<>();

        System.out.println("Adding el: ");
        linkedHashMap.put(3, "Test");
        linkedHashMap.put(4, "Test1");
        linkedHashMap.put(5, "Test2");
        linkedHashMap.put(6, "Test3");

        System.out.println("LL hash Map content: ");

        Set set = linkedHashMap.entrySet();

        for(Object element: set) {
            Map.Entry mE = (Map.Entry) element;
            System.out.println("LHM element: " + mE.getKey() + " | " + mE.getValue());
        }

        System.out.println("\n===========================\n");

        System.out.println("Modif: ");
        String name = linkedHashMap.get(3);
        System.out.println(name);
        name += " Test0";
        linkedHashMap.put(3,name);



        for(Object element: set) {
            Map.Entry mE = (Map.Entry) element;
            System.out.println("LHM element: " + mE.getKey() + " | " + mE.getValue());
        }
    }
}
