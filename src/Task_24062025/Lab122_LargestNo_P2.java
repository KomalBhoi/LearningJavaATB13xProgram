package Task_24062025;

import java.util.Scanner;
public class Lab122_LargestNo_P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int n1= sc.nextInt();
        int n2= sc.nextInt();

        if(n1 > n2){
            System.out.println(n1 + " is largest number");
        }
        else{
            System.out.println(n2 + " is largest number");
        }
    }
}
