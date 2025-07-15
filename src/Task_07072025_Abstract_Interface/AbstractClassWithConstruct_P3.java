package Task_07072025_Abstract_Interface;

public class AbstractClassWithConstruct_P3 {
    public static void main(String[] args) {
        juniorStudent j1 = new juniorStudent();
        j1.study();
    }
}

abstract class Student{
    Student(){
        System.out.println("Abstract class constructor called");
    }

    void study(){
        System.out.println("Method from abstract class");
    }
}

class juniorStudent extends Student{

}
