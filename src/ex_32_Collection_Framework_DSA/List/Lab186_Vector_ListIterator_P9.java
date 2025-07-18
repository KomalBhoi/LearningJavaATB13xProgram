package ex_32_Collection_Framework_DSA.List;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Lab186_Vector_ListIterator_P9 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Item1");
        vector.add("Item2");
        vector.add("Item3");
        vector.add("Item4");
        vector.add("Item5");

        ListIterator lstIterator = vector.listIterator();
        while(lstIterator.hasNext()){
            System.out.println(lstIterator.next());
        }

        System.out.println("------------------");
        while(lstIterator.hasPrevious()){
            System.out.println(lstIterator.previous());
        }

        System.out.println("----------");
        Iterator iterator =vector.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
