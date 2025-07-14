package Task_04072025_AccessModifier;

public class ProtectedAccessModifier_P6 {
    public static void main(String[] args) {
        Dog4 d4 = new Dog4();
        d4.doEat();
    }
}

class Animal4{
    protected void Eat(){
        System.out.println("Animal is eating..");
    }
}

class Dog4 extends Animal4{
    void doEat(){
        Eat();
    }
}
