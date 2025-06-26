package ex_14_Strings;

import java.util.Scanner;
public class Lab129_Palindromecheck_P1 {
    public static void main(String[] args) {
        //  Palindrome
        //  madam ->  reverse(madam) -> madam ==
        //  s1 = madam
        // s1_reverse = madam
        //  s1 == s1_reverse

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.next().toLowerCase();

        String reversed_str = reverseStringSB(str);
//        String reversed_str = reverseString(str);
        if(reversed_str.equalsIgnoreCase(str)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

    }

    static String reverseString(String userInput){
        String reversed ="";
        for(int i=userInput.length()-1;i>=0;i--){
            reversed = reversed + userInput.charAt(i);
        }
        return  reversed;
    }

    static String reverseStringSB(String userInput){
        StringBuilder sb = new StringBuilder(userInput);
        return  sb.reverse().toString();
    }
}
