package ex_19_OOPs_Polymorphism;

public class Poly_MethodOverloading_P2 {
    public static void main(String[] args) {

        Home h1=new Home();
        System.out.println(h1.task(3));
        System.out.println(h1.task(true));
    }
}

class Home{

    void task(){
        System.out.println("Task 1");
    }

    int task(int a){
        System.out.println("Task 1");
        return a;
    }
    boolean task(boolean a){
        return false;
    }
}
