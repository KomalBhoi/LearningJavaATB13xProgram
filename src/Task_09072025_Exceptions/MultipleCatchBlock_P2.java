package Task_09072025_Exceptions;

public class MultipleCatchBlock_P2 {
    public static void main(String[] args) {
        int a=0;
        try{
            divideByZero(a);
            int b=10/a;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    static void divideByZero(int a){
        if(a==0){
            throw new ArithmeticException("Error a==0");
        }
    }
}
