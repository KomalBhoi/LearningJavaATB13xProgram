package ex_09_Switch;

import java.util.Scanner;

public class Lab108_Interview_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the single alphabet: ");
        char ch =scanner.next().toLowerCase().charAt(0);

        switch (ch){
            case 'a','e','i','o','u' -> System.out.println("Vowel");
            default -> System.out.println("Consonant");
        }
    }
}
