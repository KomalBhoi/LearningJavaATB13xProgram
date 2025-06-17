package ex_09_Switch;

public class Lab077_JDK13_MultipleOpt {
    public static void main(String[] args) {
        int itemCode = 007;

        switch (itemCode){
            case 001,002,005:
                System.out.println("All of them are electronic gadget.");
                System.out.println("All of them are electronic gadget.");
                System.out.println("All of them are electronic gadget.");
                break;
            case 003,007,006:
                System.out.println("This is Mech Gadget");
                System.out.println("This is Mech Gadget");
                break;
            default:
                System.out.println("None");
        }
    }
}
