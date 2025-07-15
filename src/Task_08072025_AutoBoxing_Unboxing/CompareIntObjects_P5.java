package Task_08072025_AutoBoxing_Unboxing;

//Compare two Integer objects using == and .equals() and print the results.
public class CompareIntObjects_P5 {
    public static void main(String[] args) {

        Integer a=10;
        Integer b =10;
        Integer c= 20;
        Integer d = 40;

        System.out.println("a==b:"+(a==b));
        System.out.println("c==d:"+(c==d));
        System.out.println("a.equals(b):"+(a.equals(b)));
    }
}
