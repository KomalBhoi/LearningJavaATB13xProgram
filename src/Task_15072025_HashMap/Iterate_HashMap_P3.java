package Task_15072025_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Iterate_HashMap_P3 {
    public static void main(String[] args) {

        //Map with key value pairs and iterate using entrySet()
        Map<String, String> set1= new HashMap();
        set1.put("Name","Komal");
        set1.put("Role","Tester");
        set1.put("Level","Senior");

        // System.out.println(set1);
        System.out.println("Map with key value pairs and iterate using entrySet()");
        for(Map.Entry<String,String> item:set1.entrySet()){
            System.out.println(item.getKey() + " -> " + item.getValue());
        }


        //Map with key value pairs and iterate using keySet()
        System.out.println("Map with key value pairs and iterate using keySet()");
        for(String key:set1.keySet()){
            System.out.println(key + " -> " +set1.get(key));
        }

        //Map with key value pairs and iterate using Iterator()
        System.out.println("Map with key value pairs and iterate using Iterator");
        Iterator<Map.Entry<String,String>> iterator = set1.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,String> entry = iterator.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
