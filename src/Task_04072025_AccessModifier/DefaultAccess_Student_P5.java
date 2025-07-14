package Task_04072025_AccessModifier;

public class DefaultAccess_Student_P5 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.showDetails();
    }
}


class Student{

    void showDetails(){
        System.out.println("Default access modifier called..");
    }
}

class TestDefault extends Student{
    TestDefault(){
        System.out.println("Test default constructor called..");
    }
}