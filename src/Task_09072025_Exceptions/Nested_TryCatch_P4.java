package Task_09072025_Exceptions;

public class Nested_TryCatch_P4 {
    public static void main(String[] args) {
        try{
            try{
                //Inner try block
                int[] arr ={1,2,3};
                System.out.println("Accessing the 5th element:"+arr[4]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Inner catch block - Array Index out of bound.");
            }

            //Outer try block
            int a=10;
            int b=0;
            int result = a/b;
            System.out.println("Result: "+result);

        }catch(ArithmeticException e){
            System.out.println("Outer catch block - divisible by Zero.");
        }
        System.out.println("Program continues after exception handling.");
    }
}
