package Task_07072025_Abstract_Interface;

public class InterfaceConstants_P8 {
    public static void main(String[] args) {
        Car1 c1 = new Car1();
        c1.displaySpeed();
    }
}

interface SpeedLimit{
    int max_speed =120; // public static final by default
}

class Car1 implements SpeedLimit{
    public void displaySpeed(){
        System.out.println("Max speed is: " + max_speed);
    }
}