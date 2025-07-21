package Task_20072025_HashMap;

import java.util.HashMap;
import java.util.Map;

public class FilterNameCharA_P8 {
    public static void main(String[] args) {

        Map<Integer,String> student=new HashMap<>();
        student.put(101,"Anjali");
        student.put(102,"Dipak");
        student.put(103,"Aman");
        student.put(104,"Ravi");

        for(Map.Entry<Integer,String> item:student.entrySet()){
            if(item.getValue().startsWith("A")){
                System.out.println(item.getKey() + " -> " + item.getValue());
            }
        }
    }
}
