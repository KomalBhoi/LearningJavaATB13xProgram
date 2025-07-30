package Task_11072025_ArrayList;

import java.util.LinkedList;

public class InsertElement_LinkedList_P6 {
    public static void main(String[] args) {

        LinkedList<String> fruits= new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("Original List:" +fruits);

        //Move "Orange" from index 1 to 0
        int currentIndex = 1;
        int newIndex = 0;

        String fruitsLst = fruits.remove(1);
        fruits.add(newIndex,fruitsLst);
        System.out.println("Updated List:" + fruits);

    }
}
