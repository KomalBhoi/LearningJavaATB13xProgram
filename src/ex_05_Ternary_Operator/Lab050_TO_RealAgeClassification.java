package ex_05_Ternary_Operator;

public class Lab050_TO_RealAgeClassification {
    public static void main(String[] args) {
        // age = 23
        //  age < 18 ->  Minor
        //  18 < age > 65 ->  Adult
        // age > 65 -> Senior Citizen

        int age = 99;
        String result =(age < 18)? "Minor" : (age < 65)? "Adult" : "Senior";
        System.out.println(result);
    }
}
