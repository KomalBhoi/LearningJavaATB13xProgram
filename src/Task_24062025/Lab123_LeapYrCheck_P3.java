package Task_24062025;

import java.util.Scanner;
public class Lab123_LeapYrCheck_P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year to check leap year: ");
        int yr = sc.nextInt();

        if(yr%4 == 0 && yr%400 !=0){
            System.out.println("Leap Year!");
        }
        else if(yr%100 == 0){
            System.out.println("Leap Year!");
        }
        else{
            System.out.println("Not a leap year!");
        }
    }
}
