package ex_10_For_Loop;

import java.util.Scanner;

public class Lab097_Task_IsPalindrome {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the String to check Palindrome or Not!");
        String str_palindrome=scanner.next();

        str_palindrome =str_palindrome.replaceAll("\\s+","").toLowerCase();
        int left =0;
        int right = str_palindrome.length() - 1;

        while(left < right){
            if(str_palindrome.charAt(left) != str_palindrome.charAt(right)){
                System.out.println("String is not Palindrome");
                left++;
                right --;
                break;
            }
            else{
                System.out.println("String is Palindrome!");
                break;
            }
        }
    }
}
