package Collections;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();

        System.out.println("Adding elements into hashMap...");

        hashMap.put("Proselyte","Java");
        hashMap.put("AsyaSmile","UI/UX");
        hashMap.put("Peter","C++");
        hashMap.put("Ann","PHP");

        System.out.println("Initial hashMap:");
        System.out.println(hashMap);



        System.out.println("\n===================\n");
        System.out.println("Initial hashMap content using Set:");

        System.out.println(hashMap);

        Set<Map.Entry<String, String>> set = hashMap.entrySet();

        for(Object element : set) {
            Map.Entry mapEntry = (Map.Entry) element;
            System.out.println(mapEntry.getKey() + ": " + mapEntry.getValue());
        }
        System.out.println("\n===================\n");
        System.out.println("Modifying Proselyte's specialty...");

        String specialty = hashMap.get("Proselyte");
        specialty += " Developer (Changed)";
        hashMap.put("Proselyte",specialty);

        System.out.println("\n===================\n");
        System.out.println("Final hashMap content using Set:");

        set = hashMap.entrySet();
        for(Object element : set) {
            Map.Entry mapEntry = (Map.Entry) element;
            System.out.println(mapEntry.getKey() + ": " + mapEntry.getValue());
        }

        System.out.println("\n===================\n");
        System.out.println("Final2 hashMap content using Set:");

        hashMap.put("Timur","JunJavaDev");
        set = hashMap.entrySet();
        for(Object element : set) {
            Map.Entry mapEntry = (Map.Entry) element;
            System.out.println(mapEntry.getKey() + ": " + mapEntry.getValue());
        }
    }
}
