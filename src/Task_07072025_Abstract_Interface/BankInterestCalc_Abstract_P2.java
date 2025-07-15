package Task_07072025_Abstract_Interface;

public class BankInterestCalc_Abstract_P2 {
    public static void main(String[] args) {
        SBI s1 = new SBI();
        s1.getInterestRate(6.7);
        HDFC h1 = new HDFC();
        h1.getInterestRate(7.0);
    }
}

abstract class Bank{
    abstract void getInterestRate(double interestRate);
}

class SBI extends Bank{
    @Override
    void getInterestRate(double interestRate){
        System.out.println("SBI Interest Rate: " + interestRate +"%");
    }
}

class HDFC extends Bank{
    @Override
    void getInterestRate(double interestRate){
        System.out.println("HDFC Interest Rate: "+ interestRate +"%");
    }
}
