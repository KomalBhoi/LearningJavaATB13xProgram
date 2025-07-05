package ex_17_OOPs;

public class Lab158_Cats {
    Lab158_Cats(){
        System.out.println("Default Constructor - Main class");
    }
    public static void main(String[] args) {
        Cat c1 = new Cat();
        new Cat();
        Cat c2;

//        c2.running();
        new Cat().running();
    }
}

class Cat{
    String name;

    void running(){
        System.out.println("Running");
    }
}
