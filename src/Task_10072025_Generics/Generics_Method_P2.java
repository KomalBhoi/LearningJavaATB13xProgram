package Task_10072025_Generics;

public class Generics_Method_P2 {
    public static void main(String[] args) {
        display(3,5);
        display(3.14, 2.45);
        display("Komal","Bhoi");
    }

//    static <T> T display(T a,T b,T c){
//        System.out.println(a);
//        System.out.println(b);
//        return null;
//    }

    static <T> void display(T a, T b){
        System.out.println(a);
        System.out.println(b);
    }
}
