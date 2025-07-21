package ex_32_Collection_Framework_DSA.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab193_HashMap_P1 {
    public static void main(String[] args) {
        Map m1=new HashMap(); //Map is key and value pair.

        m1.put("name","Komal");
        m1.put("rollno",1);
        m1.put("phone",902273142);
        System.out.println(m1);

        Map m2=new LinkedHashMap();
        m2.put("name","Rutuja");
        m2.put("rollno",2);
        m2.put("phone",705647352);
        System.out.println(m2);

        Map m3=new TreeMap();
        m3.put("FirstName","Komal");
        m3.put("LastName","Bhoi");
        m3.put("rollno",3);
        m3.put("phone",94324523);
        System.out.println(m3);
    }
}
