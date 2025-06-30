package Task_27062025;

import java.util.Scanner;

public class Lab154_BonusCalculation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary - ");
        int salary = sc.nextInt();
        System.out.println("Enter the year of experience - ");
        float year = sc.nextFloat();

        if(year >=1 && year <=3 ){
            System.out.println((salary * 0.05) + " Bonus of the employee base on year of experience.");
        }
        else if(year >=4 && year <=6){
            System.out.println((salary * 0.1) + " Bonus of the employee base on year of experience.");
        }
        else if(year > 6){
            System.out.println((salary * 0.15) + " Bonus of the employee base on year of experience.");
        }
        else {
            System.out.println("Not applicable for bonus.");
        }
    }
}
