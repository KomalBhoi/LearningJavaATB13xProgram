package Task_09072025_Exceptions;

public class TryCatch_WithoutException_P9 {
    public static void main(String[] args) {
        int a =5;
        try{
            int b=10/a;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Executed any how..");
        }
    }
}
