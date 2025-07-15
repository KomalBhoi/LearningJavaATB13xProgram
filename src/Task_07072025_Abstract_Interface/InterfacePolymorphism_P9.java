package Task_07072025_Abstract_Interface;

public class InterfacePolymorphism_P9 {
    public static void main(String[] args) {
        Guitar g1 = new Guitar();
        g1.play();
        Piano p1 = new Piano();
        p1.play();
    }
}

interface Playable{
    default void play(){
    }
}

class Guitar implements Playable{
    public void play(){
        System.out.println("Playing Guitar");
    }
}

class Piano implements Playable{
    public void play(){
        System.out.println("Playing Piano");
    }
}
