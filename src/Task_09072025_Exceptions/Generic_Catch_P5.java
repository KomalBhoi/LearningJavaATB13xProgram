package Task_09072025_Exceptions;

public class Generic_Catch_P5 {
    public static void main(String[] args) {
        int a =0;
        try{
            int b=10/0;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
