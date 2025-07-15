package Task_07072025_Abstract_Interface;

public class MultipleInterface_P6 {
    public static void main(String[] args) {
        Document d1= new Document();
        d1.print("1");
        d1.show("2");
    }
}

interface Printable{
    void print(String printMsg);
}

interface showable{
    void show(String showMsg);
}

class Document implements Printable,showable{
    @Override
    public void print(String printMsg){
        System.out.println("Printing Document");
    }

    @Override
    public void show(String showMsg){
        System.out.println("Showing Document");
    }
}

