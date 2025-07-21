package ex_32_Collection_Framework_DSA.SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab191_SET_P1 {
    public static void main(String[] args) {
        Set hs = new HashSet();
        Set lhs = new LinkedHashSet();
        Set ths = new TreeSet();

        hs.add("Komal");
        hs.add("Komal");
        hs.add("Bhoi");
        System.out.println(hs);

        lhs.add("Komal");
        lhs.add("Komal");
        lhs.add("Komal");
        lhs.add("Bhoi");
        System.out.println(lhs);

        ths.add("105");
        ths.add("102");
        ths.add("103");
        ths.add("100");
        System.out.println(ths);
    }
}
