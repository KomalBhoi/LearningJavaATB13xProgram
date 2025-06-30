package Task_27062025;

import java.util.Scanner;

public class Lab152_EligibleForLoan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age - ");
        int age = sc.nextInt();
        int minAge = 18;
        System.out.println("Enter the Salary - ");
        float salary = sc.nextFloat();
        System.out.println("Enter the Credit Score - ");
        int Creditscore = sc.nextInt();

        if (age >= 18 && age <= 80){
            if(salary > 30000 || salary == 30000){
                if(Creditscore >=650 && Creditscore <= 850){
                    System.out.println("You are eligible for loan");
                }
                else{
                    System.out.println("You are not eligible for loan");
                }
            }
            else{
                System.out.println("You are not eligible for loan");
            }
        }
        else{
            System.out.println("You are not eligible for loan");
        }
    }
}
