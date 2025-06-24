package Task_24062025;

import java.util.Scanner;
public class Lab127_ATMWithdrawalSimulation_P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount want to withdraw: ");
        int withdrawalAmt=sc.nextInt();
        int AcctBalance = 10000;
        int RemainingBalance;

        if(withdrawalAmt>0 && withdrawalAmt<=10000 && withdrawalAmt%100 == 0){
            RemainingBalance = AcctBalance - withdrawalAmt;
            System.out.println("Remaining balance is " + RemainingBalance);
        }
        else{
            System.out.println("Withdrawal fails");
        }
    }
}
