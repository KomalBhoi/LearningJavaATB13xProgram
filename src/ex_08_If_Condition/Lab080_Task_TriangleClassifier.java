package ex_08_If_Condition;

import java.util.Scanner;

public class Lab080_Task_TriangleClassifier {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the 3 length of the sides: ");
        int sd1 = scanner.nextInt();
        int sd2 = scanner.nextInt();
        int sd3 =scanner.nextInt();

        if(sd1 == sd2 && sd2 == sd3 && sd1 == sd3){
            System.out.println("The triangle is equilateral.");
        }
        else if(sd1 == sd2 || sd2 == sd3 || sd1 == sd3){
            System.out.println("The triangle is isosceles.");
        }
        else{
            System.out.println("The triangle s scalene");
        }
    }
}
