package Task_03072025_Polymorphism.MethodOverriding;

public class EmployeeRoleInfo_P3 {
    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.role();
        Manager mgr = new Manager();
        mgr.role();
        Clerk cl = new Clerk();
        cl.role();
        Tester t1=new Tester();
        t1.role();
    }
}


class Employee{
    void role(){
        System.out.println("General Employee");
    }
}

class Manager extends Employee{
    @Override
    void role(){
        System.out.println("Manager Role..");
    }
}
class Clerk extends Employee{
    @Override
    void role(){
        System.out.println("Clerk Role..");
    }
}

class Tester extends Employee{
    @Override
    void role(){
        System.out.println("Tester Role..");
    }
}