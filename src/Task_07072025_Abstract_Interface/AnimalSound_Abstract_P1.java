package Task_07072025_Abstract_Interface;

public class AnimalSound_Abstract_P1 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.makeSound();
        Cat c1 = new Cat();
        c1.makeSound();
    }
}

class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Dog Bark..");
    }
}

class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("Cat Meows..");
    }
}

abstract class Animal {
    abstract void makeSound();
}
