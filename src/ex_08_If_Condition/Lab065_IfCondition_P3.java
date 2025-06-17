package ex_08_If_Condition;

import java.util.Scanner;

public class Lab065_IfCondition_P3 {
    public static void main(String[] args) {
        // Allowed to vote or not
        // If age > 18 -> allowed to vote.
        // else age < >18 -> Not allowed to vote.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age");
        int age =scanner.nextInt();

        if(age>=18){
            System.out.println("You can vote!");
        }
        else{
            System.out.println("You can not vote!");
        }
    }
}
