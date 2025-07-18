package ex_32_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.List;

public class Lab181_ArrayList_P4 {
    public static void main(String[] args) {
        List lst = new ArrayList();
        lst.add("1");
        lst.add("2");
        lst.add("3");
        lst.add("3");
        lst.add(4);
        lst.add(true);
        lst.add("3");

        System.out.println(lst.size());
        System.out.println(lst.isEmpty());
        System.out.println(lst.contains("1"));
        System.out.println(lst.contains(1));

        System.out.println(lst.indexOf("3"));
        System.out.println(lst.lastIndexOf("3"));

        System.out.println(lst);
        System.out.println("--------------------");

        for (int i = 0; i < lst.size(); i++) {
            System.out.println(lst.get(i));
        }
        System.out.println("--------------------");

        for (Object o : lst) {
            System.out.println(o);
        }

        lst.set(1, 25);
        System.out.println(lst);

        System.out.println("--------------------");
        lst.remove(0);
        System.out.println(lst);

        lst.clear();
        System.out.println(lst);
    }

}
