package Task_09072025_Exceptions;

public class Try_Catch_Finally_P3 {
    public static void main(String[] args) {
        final double pi = 3.14;
        int a=0;
        try{
            int b=10/0;
        }
        catch(ArithmeticException e){
            System.out.println("Divide by Zero");
        }
        finally{
            System.out.println("I will be executed anyhow!!");
        }
    }
}
