package ex_18_OOPs_Inheritance;

public class Lab160_SingleInheritance_P1 {
    public static void main(String[] args) {
        TestCase1 t1 = new TestCase1();
        t1.runningTC1();

        TestCase2 t2 = new TestCase2();
        t2.runningTC2();

        CommonToAll c1 = new CommonToAll();
        TestCase1 t3 = new TestCase1();
        CommonToAll c2 = new TestCase2(); //Dynamic dispatch
    }
}
