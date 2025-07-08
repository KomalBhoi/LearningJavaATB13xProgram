package Task_03072025_Polymorphism.MethodOverriding;

public class LoginFeature_P4 {
    public static void main(String[] args) {

        User u1 = new User();
        u1.login();
        User u2 = new AdminUser();
        u2.login();
        User u3 = new RegularUser();
        u3.login();
    }
}

class User{
    void login(){
        System.out.println("User login..!!");
    }
}

class AdminUser extends User{
    @Override
    void login(){
        System.out.println("Admin User login..!!");
    }
}

class RegularUser extends User{
    @Override
    void login(){
        System.out.println("Regular User login..!!");
    }
}
