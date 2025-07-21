package Task_20072025_HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapToTreeMap_P4 {
    public static void main(String[] args) {

        Map<String,Integer> set1= new HashMap<>();
        set1.put("Ravi", 80);
        set1.put("Anjali", 95);
        set1.put("Dipak",75);
        System.out.println("Data in HashMap:" +set1);

        Map<String, Integer> set2= new TreeMap<>(set1);
        System.out.println("Data transfer from Hashmap to TreeMap:" +set2);
    }
}
