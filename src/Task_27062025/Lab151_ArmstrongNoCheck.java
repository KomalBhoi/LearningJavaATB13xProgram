package Task_27062025;

import java.util.Scanner;

public class Lab151_ArmstrongNoCheck {
    public static void main(String[] args) {

        //Logic to check Armstrong Number
//        Take input number.
//        Count the number of digits (n) in the number.
//        Extract each digit and compute digit^n.
//        Sum all those powered digits.
//        If the sum equals the original number, it’s an Armstrong number.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int userInput = sc.nextInt();
        int originalNo = userInput;
        int n =0;

        //Step 1: Count the number of digits
        int temp = userInput;
        while(temp > 0){
            temp /=10;
            n++;
        }
//        System.out.println(temp);
//        System.out.println(n);

        //Step 2: Calculate the sum of powered digits
        int sum =0;
        temp = userInput;
        while(temp > 0){
            int digit = temp % 10;
            sum +=Math.pow(digit, n); //digit^n
            temp /=10;
        }

        //Step 3: Compare and print result
        if(sum == originalNo){
            System.out.println(originalNo + " is an Armstrong number");
        }
        else{
            System.out.println(originalNo + " is not an Armstrong number");
        }
    }
}
