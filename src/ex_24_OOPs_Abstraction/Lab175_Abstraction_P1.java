package ex_24_OOPs_Abstraction;

public class Lab175_Abstraction_P1 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.done();
        //Father f1 = new Father(); // This is abstract in nature.
        Child child = new Child();
        Father f2 = new Child(); //Dynamic dispatch
        child.loan50k();
        }
    }


class Car{
    // This is concreate class
    // this doesn't have the abstract methods
    void done(){
        System.out.println("Car class");
    }
}

abstract class Father{
    // This is called the abstract function.
    abstract void loan50k();

    // as a complete function
    void loan25k(){
        System.out.println("Given the 25k");
    }
}

class Child extends Father{

    @Override
    void loan50k(){
        System.out.println("Son has to give the 50k loan");
    }
}
