package ex_21_AccessModifier.criminal;


import ex_21_AccessModifier.Police.Cop;
public class SubClass extends Cop {

    public SubClass(int bullet){
        super(bullet);
    }

    public static void main(String[] args){
//        new SubClass().thisisDefaultF1();
//        new SubClass().canIShoot();
    }
}
