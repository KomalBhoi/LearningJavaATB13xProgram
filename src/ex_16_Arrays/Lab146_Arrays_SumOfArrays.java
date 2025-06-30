package ex_16_Arrays;

public class Lab146_Arrays_SumOfArrays {
    public static void main(String[] args) {
        int[] numbers ={12,45,75};
        int sum =0;

        for(int i=0;i < numbers.length;i++){
            sum = sum + numbers[i];
        }
        System.out.println(sum);
    }
}
