package Task_10072025_Generics;

public class Generics_Class_P3 {
    public static void main(String[] args) {
        GenericClass g1 = new GenericClass(10);
        System.out.println(g1);
        GenericClass g2 = new GenericClass(3.14);
        System.out.println(g2);
        GenericClass g3 = new GenericClass(true);
        System.out.println(g3);
        GenericClass g4 = new GenericClass("Komal");
        System.out.println(g4);
    }
}

class GenericClass<T>{
    private T data;

    public GenericClass(T data){
        this.data =data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}