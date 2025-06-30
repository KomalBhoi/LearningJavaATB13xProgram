package Task_27062025;

import java.util.Locale;
import java.util.Scanner;

public class Lab156_TravelBasedOnVisaStatus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age of Traveller - ");
        int age = sc.nextInt();
        System.out.println("Enter the Visa Status of Traveller - ");
        String visaStatus = sc.next().toLowerCase();

        if(age >=18 && visaStatus.equals("valid")){
            System.out.println("Person can travel");
        }
        else{
            System.out.println("Person can't travel");
        }
    }
}
