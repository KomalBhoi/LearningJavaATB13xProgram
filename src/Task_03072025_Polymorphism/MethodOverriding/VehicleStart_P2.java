package Task_03072025_Polymorphism.MethodOverriding;

public class VehicleStart_P2 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.Start();
        Bike b1 = new Bike();
        b1.Start();
        Car c1= new Car();
        c1.Start();
    }
}

class Vehicle{
    void Start(){
        System.out.println("Default Start!!");
    }
}

class Bike extends Vehicle{
    @Override
    void Start(){
        System.out.println("Kick start the bike");
    }
}

class Car extends Vehicle{
    @Override
    void Start(){
        System.out.println("Turn the key to start the car");
    }
}