package Task_24062025;

import java.util.Scanner;
public class Lab124_CalculateGrade_P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks between 0 and 100: ");
        int marks = sc.nextInt();
        String grade;

        if(marks >= 90 && marks <=100){
            grade ="A+";
        }
        else if(marks >=80 && marks < 90){
            grade ="A";
        }
        else if(marks >=70 && marks < 80){
            grade = "B";
        }
        else if(marks >=60 && marks < 70){
            grade = "C";
        }
        else if(marks >=50 && marks < 60){
            grade = "D";
        }
        else if(marks >=40 && marks < 50){
            grade = "E";
        }
        else{
            grade ="Fail";
        }
        System.out.println(grade + " grade of the student.");
    }
}
