package Task_03072025_Polymorphism.MethodOverloading;

public class MultiplyNumbers_P3 {
    public static void main(String[] args) {

        MathOperations m1 = new MathOperations();
        int mo1 = m1.MultiplyNos(5,10);
        System.out.println(mo1);
        int mo2 = m1.MultiplyNos(4,5,10);
        System.out.println(mo2);
    }
}

class MathOperations{

    int MultiplyNos(int a, int b){
        return a*b;
    }

    int MultiplyNos(int a, int b, int c){
        return a*b*c;
    }
}
