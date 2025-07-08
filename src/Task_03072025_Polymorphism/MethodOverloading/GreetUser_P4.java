package Task_03072025_Polymorphism.MethodOverloading;

public class GreetUser_P4 {
    public static void main(String[] args) {

        Greeter gt = new Greeter();
        gt.greet();
        gt.greet("Kinjal");
    }
}

class Greeter{
    void greet(){
        System.out.println("Hello");
    }

    void greet(String name){
         System.out.println("Hello, " + name);
    }
}