package Task_04072025_AccessModifier;

public class AccessPClassVariable_Super_P3 {
    public static void main(String[] args) {
        Dog1 d1 = new Dog1();
    }
}

class Animal2{
    Animal2(){
        String name ="Brew";
        System.out.println(name);
    }
}

class Dog1 extends Animal2{
    Dog1(){
        super();
    }
}