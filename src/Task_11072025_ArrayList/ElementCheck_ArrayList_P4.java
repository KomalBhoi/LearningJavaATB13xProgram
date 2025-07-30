package Task_11072025_ArrayList;

import java.util.ArrayList;

public class ElementCheck_ArrayList_P4 {
    public static void main(String[] args) {

        ArrayList<String> cityNm = new ArrayList<>();

        cityNm.add("Mumbai");
        cityNm.add("Pune");
        cityNm.add("Delhi");

        for(String str:cityNm) {
            if(str.equals("Pune")){
                System.out.println(str + " is in the list.");
            }
        }
    }
}
