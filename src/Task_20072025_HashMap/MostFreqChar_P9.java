package Task_20072025_HashMap;

import java.util.HashMap;
import java.util.Map;

public class MostFreqChar_P9 {
    public static void main(String[] args) {

        String input="aaaabbbcc";

        Map<Character,Integer> freq= new HashMap<>();
        for(char c:input.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }

        //Find the highest count character
        char MostFreqChar='\0';
        int maxCount=0;

        for(Map.Entry<Character,Integer> entry: freq.entrySet()){
            if(entry.getValue() > maxCount){
                MostFreqChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        System.out.println("Most frequent character is: " + MostFreqChar + "(" + maxCount + ") times");
    }
}
