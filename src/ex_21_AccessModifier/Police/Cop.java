package ex_21_AccessModifier.Police;

public class Cop {
    public int gun;
    private String iCard;

    public Cop(int bullet){
        this.gun =bullet;
    }

    protected void canIShoot(){
        System.out.println("Yes you can!!");
    }

    void thisDefualtF1(){
        System.out.println("Hi, Cop!");
    }
}
