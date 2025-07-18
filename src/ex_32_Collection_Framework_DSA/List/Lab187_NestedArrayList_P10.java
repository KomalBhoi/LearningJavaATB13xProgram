package ex_32_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.List;

public class Lab187_NestedArrayList_P10 {
    public static void main(String[] args) {

        List<String> fruit1= new ArrayList();
        fruit1.add("Orange");
        fruit1.add("Apple");
        fruit1.add("Cherry");
        fruit1.add("Banana");
        System.out.println(fruit1);

        System.out.println("-----------");
        List fruit2 = new ArrayList();
        fruit2.add("Mango");
        fruit2.add("Grapes");
        fruit2.add("Papaya");
        System.out.println(fruit2);

        System.out.println("-----------");
        List vegetables = new ArrayList();
        vegetables.add("Tomato");
        vegetables.add("Onion");
        vegetables.add("Potato");
        System.out.println(vegetables);

        System.out.println("-----------");
        List all_fruits = new ArrayList();
        all_fruits.add(fruit1);
        all_fruits.add(fruit2);
        all_fruits.add(vegetables);
        System.out.println(all_fruits);
        System.out.println(all_fruits.get(2));
    }
}
