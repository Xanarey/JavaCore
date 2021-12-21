package Collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(2, "Proselyte");
        treeMap.put(1, "AsyaSmile");
        treeMap.put(3, "Peter");
        treeMap.put(5, "Timur");
        treeMap.put(4, "Konstantin");

        System.out.println("TreeMap content: ");

        Set<Map.Entry<Integer, String>> set = treeMap.entrySet();

        for(Object element: set) {
            Map.Entry mapEntry = (Map.Entry) element;
            System.out.println("ID: " + mapEntry.getKey() + " " + mapEntry.getValue());
        }

        System.out.println("\n========================\n");
        System.out.println("Modifying Proselyte...");

        String name = treeMap.get(2);
        name += " Changed";
        treeMap.put(2, name);

        name = treeMap.get(5);
        name += " Java";
        treeMap.put(5, name);

        set = treeMap.entrySet();

        for(Object element: set) {
            Map.Entry mapEntry = (Map.Entry) element;
            System.out.println("ID: " + mapEntry.getKey() + " " + mapEntry.getValue());
        }

    }
}