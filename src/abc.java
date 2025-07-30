public class abc {

        public static void main(String[] args) {
            Example e = new Child();
            e.fun(5); }

}

class Example {
    void fun(int x) { System.out.print("int "); } }
class Child extends Example {
    void fun(double d) { System.out.print("double "); } }
