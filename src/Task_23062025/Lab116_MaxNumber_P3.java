package Task_23062025;

import java.util.Scanner;
public class Lab116_MaxNumber_P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        if(n1> n2){
            System.out.println(n1+" is maximum number.");
        }
        else{
            System.out.println(n2+" is maximum number.");
        }
    }
}
