package ex_32_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab189_ArrayList_UserInput_P12 {
    public static void main(String[] args) {

        // Multiple inputs from the user and store them in separate
        // names, ages - store them
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        String continueInput = "Y"; // Control variable for input loop

        while(continueInput.equalsIgnoreCase("Y")){
            System.out.println("Enter the name");
            String name = sc.next();
            names.add(name);

            System.out.println("Enter the age");
            Integer age = sc.nextInt();
            ages.add(age);

            sc.nextLine();
            System.out.println("Do you want to enter another record? (Y/N): ");
            continueInput = sc.nextLine();
        }

        for(Object o1:names){
            System.out.println(o1);
        }

        for(Object o2:ages){
            System.out.println(o2);
        }

        sc.close();
    }
}
