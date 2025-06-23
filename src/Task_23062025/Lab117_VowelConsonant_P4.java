package Task_23062025;

import java.util.Scanner;
public class Lab117_VowelConsonant_P4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter single character: ");
        char ch = scanner.next().toLowerCase().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'|| ch == 'u'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
    }
}
