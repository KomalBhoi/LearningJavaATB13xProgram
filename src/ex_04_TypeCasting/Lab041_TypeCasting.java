package ex_04_TypeCasting;

public class Lab041_TypeCasting {
    public static void main(String[] args) {
        byte b =10;
        int a=b;        //widening -> Implicit casting
        int a1=(int)b;  //Widening -> Explicit casting

        System.out.println(a);
        System.out.println(a1);
    }
}
