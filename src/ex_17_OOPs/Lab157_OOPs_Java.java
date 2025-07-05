package ex_17_OOPs;

public class Lab157_OOPs_Java {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2;
        new Student();
    }
}

class Student{
    String name;

    // It is called default constructor, same name as class name.
    Student(){
        System.out.println("Default constructor");
    }

    void sleep(){
        System.out.println("Hi");
    }
}

class A{}
class B{}
