package Task_23062025;

import java.util.Scanner;
public class Lab115_EvenOdd_P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        if(number%2 == 0){
            System.out.println("Number is Even!");
        }
        else{
            System.out.println("Number is Odd!");
        }
    }
}
