package ex_32_Collection_Framework_DSA.Map;

import java.util.HashMap;
import java.util.Map;

public class Lab194_Hashmap_P2 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("id",1);
        map.put("id",2);
        map.put("id2",2);
        map.put("id3",24);
        map.put("id6",24);
        map.put("id5",null);
        map.put("id5",null);
        map.put(null,102);
        map.put(null,103);

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("id2"));
        System.out.println(map.containsValue(99));

        System.out.println(map.keySet());
        System.out.println(map.values());

        System.out.println(map.get("id3"));
        System.out.println(map.remove("id3"));
        System.out.println(map);
    }
}
