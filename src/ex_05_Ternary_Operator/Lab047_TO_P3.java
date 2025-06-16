package ex_05_Ternary_Operator;

public class Lab047_TO_P3 {
    public static void main(String[] args) {
        // The min number between two numbers by using ternary operator.
        int x =50;
        int y =20;

        int min = x < y ? x:y;
        System.out.println(min);
        System.out.println(Math.max(x,y));
    }
}
