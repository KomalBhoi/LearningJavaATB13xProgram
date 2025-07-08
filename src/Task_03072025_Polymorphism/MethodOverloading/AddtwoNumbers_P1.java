package Task_03072025_Polymorphism.MethodOverloading;

public class AddtwoNumbers_P1 {
    public static void main(String[] args) {

    AdditionOfTwoNos a1= new AdditionOfTwoNos();
    int add1 = a1.add(5,10);
        System.out.println(add1);
    double add2 = a1.add(3.14, 9.18);
        System.out.println(add2);
    }
}

class AdditionOfTwoNos{
int add(int a, int b){
    return a+b;
}

double add(double a, double b){
    return a+b;
}
}