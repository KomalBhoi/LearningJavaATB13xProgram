package ex_32_Collection_Framework_DSA.List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Lab185_Vector_P8 {
    public static void main(String[] args) {
        Vector v = new Vector();
        Vector v1 = new Vector(10);

        v.add("Komal");
        v.add("Nirbhay");
        v.add("Vedant");
        System.out.println(v);

        v.remove("Nirbhay");
        System.out.println("After remove one :"+v);
        System.out.println(v.contains("Vedant"));

        for(int i=0;i<v.size();i++){
            System.out.println(v.get(i));
        }

        System.out.println("----For Each Loop----");
        for(Object o:v){
            System.out.println(o);
        }

        System.out.println("---------Iterator");
        Iterator iterator = v.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("---------Enumeration");
        Enumeration<Object> enumeration=v.elements();
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }
}
