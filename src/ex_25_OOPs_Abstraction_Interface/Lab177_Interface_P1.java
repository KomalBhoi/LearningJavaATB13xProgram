package ex_25_OOPs_Abstraction_Interface;

public class Lab177_Interface_P1 {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.getArea(13,5);

        square s1 = new square();
        s1.getArea(10,2);

        //A a  = new A();
    }
}

class Rectangle implements Polygon{
    @Override
    public void getArea(int length, int breadth){
        System.out.println("The area of the rectangle is " +(length*breadth));
    }
}

class square implements Polygon{

    @Override
    public void getArea(int length, int breadth){
        System.out.println("Area of square -> " + 3.14 * length * breadth);
    }
}

interface Polygon{
    void getArea(int length, int breadth);

    default void complete(){
        System.out.println("This is possible!!");
    }

    default void complete2(){
        System.out.println("This is possible2!!");
    }

    static void staticComplete(){
        System.out.println("Static F1 in interface allowed, complete");
    }
}

abstract class A{
    abstract void m1();

    void complete(){
        System.out.println("Complete!");
    }
}
