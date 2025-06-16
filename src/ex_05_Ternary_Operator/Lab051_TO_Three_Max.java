package ex_05_Ternary_Operator;

public class Lab051_TO_Three_Max {
    public static void main(String[] args) {
        // Find the maximum between the three numbers.
        // Now we will be using the logic building formula.

        int n1 =2;
        int n2=9;
        int n3=-11;

        //step 1 : Find Inputs/Outputs
        // I/O -> n1,n2,n3 - int
        // O/P - String - max number

        //step 2 : Rough logic, Think about it.
        // n1 > n2 and n1 > n3 -> n1
        // n2 > n3 and n2 > n1 -> n2
        // n3

        //step 3
        int max = (n1 > n2) ? (n1 > n3) ? n1 : n3 :(n2 > n3) ? n2 : n3;
        System.out.println(max);
    }
}
