package ex_32_Collection_Framework_DSA.Map;

import java.util.*;

public class Lab195_RealExample_P3 {
    public static void main(String[] args) {
        Map<String,Object> student1 =new HashMap();
        student1.put("Name","Rutuja");
        student1.put("Phone",902273142);
        student1.put("Address1","Pune");
        student1.put("Address2",401305);

        Map<String,Object> student2= new HashMap();
        student2.put("Name","Prachit");
        student2.put("Phone",702236213);
        student2.put("Address1","Mumbai");
        student2.put("Address2",701305);

        List students = new ArrayList();
        students.add(student1);
        students.add(student2);
        System.out.println(students);

        Set book_read_items= new HashSet();
        book_read_items.add("Attitude is Everything");
        book_read_items.add("Subconcious Mind");
        book_read_items.add("Atomic Habit");
        book_read_items.add("Eat that Frog");
        System.out.println(book_read_items);
    }
}
