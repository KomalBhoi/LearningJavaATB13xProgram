package Task_04072025_AccessModifier;

public class AccessPConstruct_Super_P1 {

    public static void main(String[] args) {
        System.out.println("--Creating a dog1 of default constructor--");
        Dog dog1 = new Dog();

        System.out.println("--Creating a dog2 with parameterized constructor--");
        Dog dog2 = new Dog("Buddy");
    }
}

//Parent class
class Animal {
    Animal(){
        System.out.println("Animal constructor called");
    }

    Animal(String type){
        System.out.println("Animal Type: "+type);
    }
}

class Dog extends Animal{
    Dog(){
        //Called default constructor of Animal
        super();
        System.out.println("Dog constructor called");
    }

    Dog(String name){
        //Called parameterized constructor of Animal
        super("Mammal");
        System.out.println("Dog name: "+name);
    }
}




