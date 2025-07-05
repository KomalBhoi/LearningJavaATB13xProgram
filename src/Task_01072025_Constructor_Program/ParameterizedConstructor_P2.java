package Task_01072025_Constructor_Program;

public class ParameterizedConstructor_P2 {
    public static void main(String[] args) {
        Student s1 = new Student("Komal",30);
        s1.displayInfo();
    }
}

class Student{
    String name;
    int age;

    //Parameterized constructor
    Student(String StudentName, int StudentAge){
        name = StudentName;
        age = StudentAge;
    }

    //Method to display student info
    void displayInfo(){
        System.out.println("Name: " +name);
        System.out.println("Age: " + age);
    }
}