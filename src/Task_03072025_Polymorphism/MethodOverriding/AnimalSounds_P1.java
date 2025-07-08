package Task_03072025_Polymorphism.MethodOverriding;

public class AnimalSounds_P1 {
    public static void main(String[] args) {

        Animal a1 = new Animal();
        a1.sound();
        Dog d1 = new Dog();
        d1.sound();
        Cat c1 = new Cat();
        c1.sound();
        Cow c2 = new Cow();
        c2.sound();
    }
}


class Animal{
    void sound(){
        System.out.println("Default Sound!!");
    }
}

class Dog extends Animal{

    @Override
    void sound(){
        System.out.println("Bark!!");
    }
}

class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Meow!!");
    }
}

class Cow extends Animal{
    @Override
    void sound(){
        System.out.println("Moo!!");
    }
}