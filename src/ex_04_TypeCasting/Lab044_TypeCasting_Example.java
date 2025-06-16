package ex_04_TypeCasting;

public class Lab044_TypeCasting_Example {
    public static void main(String[] args) {
        int course =100;
        float GST = 18.45f;

        //int total1 = course + GST; //Narrow - Implicit
        int total1 = course + (int)GST; // Narrow - Explicit
        System.out.println(total1);

        float total2=course+GST; //Widening - auto - Implicit
        float total3=(float)course+GST; //Widening - Explicit
        System.out.println(total2);
        System.out.println(total3);
    }
}
