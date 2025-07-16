package Task_10072025_Generics;

public class Generics_P1 {
    public static void main(String[] args) {
        int add = temp_sum(3,4);
        System.out.println("Addition of Integer data type: " +add);
        double dadd= temp_sum(3.15,4.2);
        System.out.println("Addition of double data type: "+dadd);
        String name =temp_sum("Komal","Bhoi");
        System.out.println("Name is: "+name);
    }

    static int temp_sum(int a, int b){
        return a+b;
    }

    static double temp_sum(double a, double b){
        return a+b;
    }

    static String temp_sum(String a, String b){
        return a+b;
    }
}
