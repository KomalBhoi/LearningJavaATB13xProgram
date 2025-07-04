package Task_27062025_IfElse_Programs;

import java.util.Scanner;

public class ConvertDays_YMD_P2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the days - ");
        int totalDays = sc.nextInt();

        int years = totalDays/365;
        int remainingDays = totalDays%365;
        int months = remainingDays/30;
        int Days = remainingDays%30;

        System.out.println("Total no of days " + totalDays + " would be " + years + " years " + months +" months " + Days + " days ");
    }
}
