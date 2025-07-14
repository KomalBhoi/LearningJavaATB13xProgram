package Task_04072025_AccessModifier;

public class AccessPClassMethod_Super_P2 {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.Sound();
    }
}

class Animal1{
    void Sound(){
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal1{
    void Sound(){
        System.out.println("Meow Meow..");
        super.Sound();
    }

}

