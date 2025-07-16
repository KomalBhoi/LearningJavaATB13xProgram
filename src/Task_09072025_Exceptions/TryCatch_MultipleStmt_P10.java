package Task_09072025_Exceptions;

public class TryCatch_MultipleStmt_P10 {
    public static void main(String[] args) {
        try {
            String ip = args[0];
            int a = Integer.parseInt(ip);
            int b = 100 / a;
            System.out.println(b);
        }
        catch(NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
