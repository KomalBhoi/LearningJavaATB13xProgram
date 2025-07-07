package ex_18_OOPs_Inheritance;

public class Lab162_MultilevelInheritance_P3 {

    public static void main(String[] args) {
        Son amit = new Son();

        GrandFather g1 = new Son(); //Dynamic Dispatch
        g1.gf();   //1BHK
        g1.home(); //Son-S3

        GrandFather g2 = new Son();
        g2.home(); //Son-S3

        Father f2 =new Son();
        f2.home(); //Son-S3
    }
}
