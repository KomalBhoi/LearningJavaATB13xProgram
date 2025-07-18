package ex_32_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lab184_LinkedList_P7 {
    public static void main(String[] args) {
        List mylist = new ArrayList(5);
        List mylist0 =new ArrayList(); //Array format - Continuous
        List mylist1 = new LinkedList();

        mylist1.add("Komal");
        mylist1.add("Bhoi");
        mylist1.add("Rutuja");
        mylist1.add("Priyanka");
        mylist1.add("Nirbhay");
        mylist1.add("Nirbhay");
        mylist1.add(null);
        mylist1.add(true);
        mylist1.add(123);
        System.out.println(mylist1);

        System.out.println(mylist1.isEmpty());
        System.out.println(mylist1.size());
        System.out.println(mylist1.contains("Bhoi"));
        System.out.println(mylist1.indexOf("Bhoi"));
        System.out.println(mylist1.get(0));

        System.out.println("-----------------");

        Iterator iterator =mylist1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        mylist0.add("Pink");
        mylist0.add("Green");
        mylist0.add("Yellow");
        mylist0.add("Purple");
        mylist0.add("White");
        mylist0.add("Red");
        System.out.println("List of colors: " + mylist0);
        System.out.println(mylist0.size());
    }
}
