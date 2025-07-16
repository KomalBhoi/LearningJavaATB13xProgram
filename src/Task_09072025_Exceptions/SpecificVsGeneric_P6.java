package Task_09072025_Exceptions;

public class SpecificVsGeneric_P6 {
    public static void main(String[] args) {
        try {
            String name = null;
            name.trim();
        }
        catch (NullPointerException e){
            System.out.println("Null pointer exception..");
        }

        try{
            String name = null;
            name.trim();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
