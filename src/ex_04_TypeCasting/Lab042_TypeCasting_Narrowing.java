package ex_04_TypeCasting;

public class Lab042_TypeCasting_Narrowing {
    public static void main(String[] args) {
        int val=300;
        //byte b =val //Narrowing (int -> byte) - Implicit Casting is not allowing.
        byte b1=(byte) val; //Narrowing (int -> byte) - Explicit Casting is not allowed.
        // In the above scenario, data loss.

        System.out.println(b1);
    }
}
