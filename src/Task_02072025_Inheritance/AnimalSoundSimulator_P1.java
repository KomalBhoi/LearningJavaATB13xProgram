package Task_02072025_Inheritance;

public class AnimalSoundSimulator_P1 {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.makeSound();
        c1.meow();
    }
}

class Animal{
    void makeSound(){
        System.out.println("Sound of Animal..");
    }
}

class Cat extends Animal{
    void meow(){
        System.out.println("Meow Meow Meow..");
    }
}