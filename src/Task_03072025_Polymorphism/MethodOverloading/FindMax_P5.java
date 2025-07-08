package Task_03072025_Polymorphism.MethodOverloading;

public class FindMax_P5 {
    public static void main(String[] args) {

        Utility u1 = new Utility();
        int max1 = u1.max(5,9);
        System.out.println(max1);
        int max2 = u1.max(5,10,15);
        System.out.println(max2);
        double max3=u1.max(11.3, 21.5);
        System.out.println(max3);
    }
}

class Utility{

    int max(int a, int b){
        return Math.max(a, b);
    }

    int max(int a, int b, int c){
        if(a>b && a>c){
            return a;
        }
        else if(b>c){
            return b;
        }
        else {
            return c;
        }
    }

    double max(double a, double b){
        return Math.max(a, b);
    }
}
