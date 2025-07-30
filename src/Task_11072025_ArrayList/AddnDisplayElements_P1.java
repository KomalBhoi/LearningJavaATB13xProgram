package Task_11072025_ArrayList;

import java.util.ArrayList;

public class AddnDisplayElements_P1 {
    public static void main(String[] args) {

        //Create an arraylist of student name
        ArrayList<String> students=new ArrayList<>();

        students.add("Dipak");
        students.add("Ravi");
        students.add("Sneha");
        students.add("Priya");
        students.add("Anjali");

        System.out.println("Student list: ");
        for(String student:students){
            System.out.println(student);
        }
    }
}
