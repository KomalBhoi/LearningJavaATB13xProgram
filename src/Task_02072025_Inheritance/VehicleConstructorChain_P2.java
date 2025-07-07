package Task_02072025_Inheritance;

public class VehicleConstructorChain_P2 {

    public static void main(String[] args) {
        Bike bk = new Bike();
        new Bike().Vehicle();
        new Bike().Bike();
    }
}

class Vehicle{
    void Vehicle(){
        System.out.println("Vehicle is ready..");
    }
}

class Bike extends Vehicle{
    void Bike(){
        System.out.println("Bike is ready..");
    }
}
