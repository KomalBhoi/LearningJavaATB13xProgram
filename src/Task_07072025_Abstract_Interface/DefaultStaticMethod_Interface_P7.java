package Task_07072025_Abstract_Interface;

public class DefaultStaticMethod_Interface_P7 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.start();
        Vehicle.fuelType();
    }
}

interface Vehicle{
    default void start(){
        System.out.println("Vehicle Started");
    }

    static void fuelType(){
        System.out.println("Fuel type is Petrol");
    }
}

class Car implements Vehicle{
}
