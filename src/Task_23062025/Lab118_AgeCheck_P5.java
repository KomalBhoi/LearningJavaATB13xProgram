package Task_23062025;

import java.util.Scanner;
public class Lab118_AgeCheck_P5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Age : ");
        int age = scanner.nextInt();

        if(age >=18){
            System.out.println("You can vote!!");
        }
        else{
            System.out.println("You can't vote!!");
        }
    }
}
