package ex_18_OOPs_Inheritance;

public class Lab163_MultiInheritance_P4 {

    public static void main(String[] args) {

        Son amit = new Son();
        System.out.println(amit.gold_gf); //10
        amit.gf(); //1BHK

        GrandFather grandFather = new GrandFather();
        grandFather.home(); //GF-S1
    }
}
