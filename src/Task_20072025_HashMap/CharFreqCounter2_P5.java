package Task_20072025_HashMap;

import java.util.HashMap;
import java.util.Map;

public class CharFreqCounter2_P5 {
    public static void main(String[] args) {

        String input="aabbccddeeff";
        Map<Character,Integer> charFreq= new HashMap<>();
        for(char c:input.toCharArray()){
            charFreq.put(c,charFreq.getOrDefault(c,0)+1);
        }
        System.out.println(charFreq);
    }
}
