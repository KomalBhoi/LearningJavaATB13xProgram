package Task_11072025_ArrayList;

import java.util.ArrayList;

public class RemoveElement_P2 {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();

        arr.add("Amit");
        arr.add("Neha");
        arr.add("Suresh");

        for(String str:arr){
            if(str.equals("Neha")){
                arr.remove("Neha");
            }
        }
        System.out.println(arr);
    }
}

