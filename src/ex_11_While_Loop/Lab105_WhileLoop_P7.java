package ex_11_While_Loop;

import java.util.Scanner;

public class Lab105_WhileLoop_P7 {
    public static void main(String[] args) {
        //Factorial Program
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the factorial program\nEnter the number!");

        if(!scanner.hasNextInt()){
            System.out.println("Enter the integer value..");
            return;
        }

        int number = scanner.nextInt();
        long factorial =1;

        if(number < 0){
            System.out.println("Negative factorial is not allowed!");
            return;
        }

        if(number <= 0){
            System.out.println(factorial);
        }
        else{
            //Calculate the factorial
            for(int i=1;i<=number;i++){
                factorial =factorial * i;
            }
        }
        System.out.println("Factorial is -> " + factorial);
    }
}
