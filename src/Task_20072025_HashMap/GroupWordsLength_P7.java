package Task_20072025_HashMap;

import java.util.*;

public class GroupWordsLength_P7 {
    public static void main(String[] args) {

        String[] input={"Java", "is", "fun", "cool", "Hi"};

        //Map to group words by their length
        Map<Integer, List<String>> wordLength=new HashMap<>();

        //Iterate over each word.
        for(String s:input){
            int length=s.length();

            // If length is not already a key, create a new list
            wordLength.putIfAbsent(length,new ArrayList<>());

            //Add word to the corresponding length list
            wordLength.get(length).add(s);
        }

        // Print the result
        for(Map.Entry<Integer,List<String>> entry:wordLength.entrySet()){
            System.out.println(entry.getKey() + "->" +entry.getValue());
        }
    }
}
