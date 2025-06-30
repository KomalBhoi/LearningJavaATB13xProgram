package Task_27062025;

import java.util.Scanner;

public class Lab155_EmployeeNetSalaryCalculation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Employee's Basic Pay - ");
        double BasicPay = sc.nextDouble();
        System.out.println("Enter the Employee's HRA - ");
        double HRA = sc.nextDouble();
        System.out.println("Enter the Employee's DA - ");
        double DA = sc.nextDouble();
        System.out.println("Enter the Employee's Professional Tax - ");
        double ProfTax=sc.nextDouble();

        //Earnings
        double grossSalary = BasicPay + HRA + DA;

        //Deductions
        double PF = BasicPay * 0.12;
        double deductions = PF + ProfTax;

        //NetSalary
        double NetSalary = grossSalary - deductions;
        System.out.println("Net Salary of Employee is " + NetSalary);
    }
}
