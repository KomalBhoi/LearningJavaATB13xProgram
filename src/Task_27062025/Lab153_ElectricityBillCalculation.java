package Task_27062025;

import java.util.Scanner;

public class Lab153_ElectricityBillCalculation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the units");
        int units = sc.nextInt();

        if(units <=100){
            System.out.println(units * 0.50 + "Rs. calculated bill based on units consumed");
        }
        else if(units > 100 && units <=200){
            System.out.println(units * 0.75 + "Rs. calculated bill based on units consumed");
        }
        else if(units > 200 && units <=300){
            System.out.println(units * 1.20 + "Rs. calculated bill based on units consumed");
        }
        else{
            System.out.println(units * 1.50 + "Rs. calculated bill based on units consumed");
        }
    }
}
