package ex_13_Functions;

public class Lab113_Functions_P4 {
    public static void main(String[] args) {
        int result = sum_of_number(4,5);
        sum_of_number_no_return(10,10);
    }

    static int sum_of_number(int a, int b){
        return a + b;
    }

    static void sum_of_number_no_return(int a, int b){
        System.out.println(a + b);
    }
}
