package ex_09_Switch;

public class Lab076_JDK13Above_05 {
    public static void main(String[] args) {
        // in JDK > 13
        //  No need of break keyword
        // one line supported.

        int itemCode = 005;
        switch (itemCode){
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("Default");
        }
    }
}
