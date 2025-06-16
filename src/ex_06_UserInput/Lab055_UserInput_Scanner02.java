package ex_06_UserInput;

import java.util.Scanner;

public class Lab055_UserInput_Scanner02 {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(s);

        System.out.println("Enter the Int");
        int i = scanner.nextInt();
        System.out.println(i);

        System.out.println("Enter the double");
        double d =scanner.nextDouble();
        System.out.println(d);
    }
}
