package ex_19_OOPs_Polymorphism;

public class Poly_MethodOverloading_P1 {

    public static void main(String[] args) {
        MathOperations m1 = new MathOperations();
        int r1=m1.add(3,4);
        System.out.println(r1);
        int r2 =m1.add(3,5,8);
        System.out.println(r2);
        double r3 = m1.add(3.14,4.56);
        System.out.println(r3);
        String r4 = m1.add("Komal"," Bhoi");
        System.out.println(r4);
    }
}

class MathOperations{
    // In the same class, When you have a method wit same
    // Same name methods but different arguments and different return type.

    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    double add(double a, double b){
        return a+b;
    }
    String add(String a, String b){
        return a+b;
    }
}
