package Task_24062025;

import java.util.Scanner;
public class Lab121_SmallestNumber_P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers: ");
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int n3 = sc.nextInt();

        if(n1 < n2 && n1 < n3){
            System.out.println(n1 + " is smallest number");
        }
        else if(n2 < n3){
            System.out.println(n2 + " is smallest number");
        }
        else{
            System.out.println(n3 + " is smallest number");
        }
    }

}
