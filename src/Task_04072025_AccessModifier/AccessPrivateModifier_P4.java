package Task_04072025_AccessModifier;

public class AccessPrivateModifier_P4 {
    public static void main(String[] args) {
        Cat1 c1 = new Cat1();
        c1.sound();
        Dog3 d1 = new Dog3();
        d1.sound();
    }
}

class Animal3{
    private void sound(){
        System.out.println("Animal Sound");
    }
//    public static void main(String[] args) {
//        Animal3 a3 = new Animal3();
//        a3.sound();
//    }
}

class Dog3 extends Animal3{
    public void sound(){
        System.out.println("Dog is barking..");
    }
}

class Cat1 extends Animal3{
    public void sound(){
        System.out.println("Cat sound is Meow Meow..");
    }
}



