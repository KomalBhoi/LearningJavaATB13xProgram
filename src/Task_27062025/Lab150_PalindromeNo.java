package Task_27062025;

import java.util.Scanner;

public class Lab150_PalindromeNo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int originalNo= sc.nextInt();
        int number = originalNo;
        int reverseNo =0;

        while(number !=0){
            int digit = number % 10; //Get last digit
            reverseNo = reverseNo * 10 + digit; //Append digit
            number = number/10; //Remove last digit
        }

        if(originalNo == reverseNo){
            System.out.println(originalNo + " is a palindrome.");
        }
        else{
            System.out.println(originalNo + " is not a palindrome.");
        }
    }
}
