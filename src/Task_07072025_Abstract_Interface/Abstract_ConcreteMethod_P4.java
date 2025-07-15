package Task_07072025_Abstract_Interface;

public class Abstract_ConcreteMethod_P4 {

    public static void main(String[] args) {
        Child c1 = new Child();
        c1.Display();
        c1.show();
    }
}


abstract class Parent{
    abstract void show();

    void Display(){
        System.out.println("Concrete Method in abstract class..");
    }
}

class Child extends Parent{
    @Override
    void show(){
        System.out.println("Abstract method implemented..");
    }
}
