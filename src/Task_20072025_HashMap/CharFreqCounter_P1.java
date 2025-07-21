package Task_20072025_HashMap;

import java.util.HashMap;
import java.util.Map;

public class CharFreqCounter_P1 {
    public static void main(String[] args) {

//        Takes a sentence and prints how many times each word appears using HashMap.
        String input = "java is easy and java is powerful";
        String input1 = input.replaceAll(" ",""); //Remove the space between words.

        Map<Character,Integer> freqMap=new HashMap();
        for(char c:input1.toCharArray()){
            freqMap.put(c, freqMap.getOrDefault(c,0)+1);
        }

        System.out.println(freqMap);
    }
}
