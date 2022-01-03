package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapL {
    public static void main(String[] args) {

        Map<String, String> hashMap = new HashMap<>(25,2);

        hashMap.put("0","zero");
        hashMap.put("key","one");
        hashMap.put("idx","two");

        for(Map.Entry<String, String> entry: hashMap.entrySet())
            System.out.println(entry.getKey() + " = " + entry.getValue());

        for(String key: hashMap.keySet())
            System.out.println(hashMap.get(key));

        Iterator<Map.Entry<String, String>> itr = hashMap.entrySet().iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}
