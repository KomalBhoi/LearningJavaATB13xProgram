package Task_23062025;

import java.util.Scanner;
public class Lab114_PositiveNegative_P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        if(number >= 0){
            System.out.println("Number is Positive!");
        }
        else{
            System.out.println("Number is Negative!");
        }
    }
}
