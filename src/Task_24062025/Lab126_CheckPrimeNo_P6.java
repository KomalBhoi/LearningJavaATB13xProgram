package Task_24062025;

import java.util.Scanner;
public class Lab126_CheckPrimeNo_P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        boolean isPrime = true;

        if(number<= 1){
            isPrime = false;
        }
        else{
            for(int i=2;i<=Math.sqrt(number);i++){
                if(number%i == 0){
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime){
            System.out.println(number + " is a prime number.");
        }
        else{
            System.out.println(number + " is not a prime number.");
        }
    }
}
