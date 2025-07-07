package Task_02072025_Inheritance;

public class MultilevelLoginSystem_P3 {

    public static void main(String[] args) {

        SuperAdmin s1=new SuperAdmin();
        s1.login();
        s1.accessAdminPanel();
        s1.shutDownSystem();
    }
}

class User{
    void login(){
        System.out.println("User Login..");
    }
}

class AdminUser extends User{
    void accessAdminPanel(){
        System.out.println("Accessing admin panel..");
    }
}

class SuperAdmin extends AdminUser{
    void shutDownSystem(){
        System.out.println("Shutting down the system..");
    }
}
