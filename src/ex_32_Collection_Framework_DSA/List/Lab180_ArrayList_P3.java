package ex_32_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.List;

public class Lab180_ArrayList_P3 {
    public static void main(String[] args) {

        ArrayList arrayList=new ArrayList();
        arrayList.add("Komal");
        arrayList.add(null);
        arrayList.add("Bhoi");
        arrayList.add("Bhoi"); //duplicate is allowed.
        arrayList.add(123);
        System.out.println(arrayList);
        System.out.println(arrayList.size());

        List l = new ArrayList(); //Dynamic Dispatch
        l.add("123");
        l.add("456");
        System.out.println(l);
        System.out.println(l.isEmpty());

        List l2 = new ArrayList();
        System.out.println(l2.isEmpty());
    }
}
