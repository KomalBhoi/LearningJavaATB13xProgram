package Task_09072025_Exceptions;

public class BasicTryCatchBlock_P1 {
    public static void main(String[] args) {
        int a=0;
//        System.out.println("1");
        try{
            int b = 10/a;
        }
        catch(ArithmeticException e){
            System.out.println("Number is not divisible by Zero..");
        }
//        System.out.println("2");
    }
}


