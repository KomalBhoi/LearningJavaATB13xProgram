package Task_20072025_HashMap;

import java.util.HashMap;
import java.util.Map;

public class WordFreqCounter_P2 {
    public static void main(String[] args) {

        String input ="java is easy and java is powerful";

        //Split the string into words
        String[] words=input.toLowerCase().split("\\s+");

        Map<String,Integer> wordFreq= new HashMap();
        for(String word:words){
            if(wordFreq.containsKey(word)){
                wordFreq.put(word,wordFreq.get(word)+1);
            }
            else{
                wordFreq.put(word,1);
            }
        }

        //Print the word count
        for(String word:wordFreq.keySet()){
            System.out.println(word + " -> " + wordFreq.get(word));
        }
    }
}
