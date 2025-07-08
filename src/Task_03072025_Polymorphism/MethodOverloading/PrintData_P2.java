package Task_03072025_Polymorphism.MethodOverloading;

public class PrintData_P2 {
    public static void main(String[] args) {

        Printer prt = new Printer();
        String s1 = prt.printData("Komal");
        System.out.println(s1);
        int a1 = prt.printData(6);
        System.out.println(a1);
        float f1 = prt.printData(14.11f);
        System.out.println(f1);
    }
}

class Printer{

    String printData(String str){
        return str;
    }

    int printData(int a){
        return a;
    }

    float printData(float f){
        return f;
    }
}
