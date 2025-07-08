package ex_19_OOPs_Polymorphism;

public class Poly_MethodOverriding_P3 {

    Dog d1 =new Dog();
    //d1.sound();
}

class Animal{
    void sound(){
        System.out.println("Default Sound!");
    }

    void A(){}
}

class Dog extends Animal{

    @Override
    void sound(){
        System.out.println("Bark!!");
    }

    void methodOverload(){ }
    void methodOverload(int a){ }
}