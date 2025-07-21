package ex_32_Collection_Framework_DSA.SET;

import java.util.*;

public class Lab192_HS_LHS_TS {
    public static void main(String[] args) {

        Set<String> hs = new HashSet<>();
        // Hashing mechanism to store the element
        // no order maintained
        // no duplicates
        // e1 -> hashcode (xyz), e2 -> hashcode -> abc

        hs.add("Apple");
        hs.add("Orange");
        hs.add("Watermelon");
        hs.add("Watermelon");
        hs.add(null);
        System.out.println(hs);

        for(String s:hs){
            System.out.println(s);
        }
        System.out.println("----------------------");
        Iterator iterator=hs.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("----------------------");
        Set lhs = new LinkedHashSet();
        // LinkedList mechanism to store the element,
        // order will maintain, no duplicates

        lhs.add("Dpple");
        lhs.add("Apple");
        lhs.add("Orange");
        lhs.add("Watermelon");
        lhs.add("Watermelon");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());
        System.out.println("----------------------");

        Set ts = new TreeSet();
        // Black and Red Tree mechanism to store the element.
        // order will maintain, Natural Sorting is done.
        // Natural Sorting - ASCII values.
        ts.add("Dpple");
        ts.add("Apple");
        ts.add("apple");
        ts.add("Orange");
        ts.add("Watermelon");
        System.out.println(ts);

        System.out.println("-----For Each-----");
        for(Object o:ts){
            System.out.println(o);
        }
    }
}
