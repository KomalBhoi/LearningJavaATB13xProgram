package ex_18_OOPs_Inheritance;

public class Lab165_Hierarchical_P6 {

    public static void main(String[] args) {
        Father1 f1 = new Father1();
        Vedant v1 = new Vedant();

        f1.home();
        v1.home();

        Nirbhay n1 =new Nirbhay();
        n1.home();

        Komal k1 = new Komal();
        k1.k2();
        k1.home();
    }
}


class Father1{
    void home(){
        System.out.println("3BHK");
    }
}

class Komal extends Father1{
    void k2(){
        System.out.println("H2 - Komal");
    }
}

class Nirbhay extends Father1{
    void n2(){
        System.out.println("Nirbhay");
    }
}

class Vedant extends Father1{
    void v2(){
        System.out.println("Vedant");
    }
}