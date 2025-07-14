package Task_04072025_AccessModifier;

public class PublicAccessModifier_P7 {
    public static void main(String[] args) {
        jrStudent st1 = new jrStudent();
        st1.showInfo();
        st1.showDetails();
        Teacher t1 = new Teacher();
        t1.studentDetails();
    }
}

class student1{
    public void showInfo(){
        System.out.println("Public Access:Student Info");
    }
}

class jrStudent extends student1{
    public void showDetails(){
        System.out.println("Public Access:Junior Student");
    }
}

class Teacher{
    public void studentDetails(){
        System.out.println("Teacher having the student details..");
    }
}