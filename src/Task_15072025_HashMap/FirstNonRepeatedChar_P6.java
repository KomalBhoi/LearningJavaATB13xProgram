package Task_15072025_HashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar_P6 {
    public static void main(String[] args) {

        String input ="aabbccdeeff";
        Map<Character,Integer> m1=new LinkedHashMap();

        // Count frequency of each character
        for(char c:input.toCharArray()){
            m1.put(c,m1.getOrDefault(c,0)+1);
        }

        // Find and print the first character with count 1
        for(Map.Entry<Character,Integer> entry : m1.entrySet()){
            if(entry.getValue() == 1){
                System.out.println("First non-repeating character: "+entry.getKey());
                return;
            }
        }
        //If no unique character is found
        System.out.println("No non-repeating character is found.");
    }
}
