package Task_08072025_AutoBoxing_Unboxing;

public class Autoboxing_Unboxing_P1 {
    public static void main(String[] args) {
        int a =10;
        Integer b = a; //This Boxing -> automatically JVM will store the value
        System.out.println("Primitive:" + a);
        System.out.println("Wrapper:" + b);

        Integer a1 = 10;
        int a2 = a1; //unboxing
        System.out.println("Unboxing again:" +a2);
    }
}


