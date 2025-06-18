package ex_10_For_Loop;

import java.util.Scanner;

public class Lab098_Task_CountVowelsCosonants {
    public static void main(String[] args) {
        int vowels_count =0;
        int consonant_count=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String name = scanner.next().toLowerCase();


        for(int i=0;i<name.length();i++) {
            char ch = name.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o'|| ch == 'u') {
                vowels_count = vowels_count + 1;
            }
            else{
                consonant_count = consonant_count + 1;
            }
        }
        System.out.println("Vowel: "+vowels_count+ " Consonant: "+consonant_count);
    }
}
