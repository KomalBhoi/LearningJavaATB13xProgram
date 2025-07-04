package Task_27062025_IfElse_Programs;

import java.util.Scanner;

public class SeniorCitizenCriteria_P4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();

        if(age >=0 && age <=12){
            System.out.println("Child Age");
        }
        else if(age >=13 && age<=19){
            System.out.println("Teenager Age");
        }
        else if(age >=20 && age<=64){
            System.out.println("Adult Age");
        }
        else{
            System.out.println("Senior Citizen");
        }
    }
}
