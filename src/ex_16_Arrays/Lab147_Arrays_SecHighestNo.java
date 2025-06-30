package ex_16_Arrays;

import java.util.Arrays;

public class Lab147_Arrays_SecHighestNo {
    public static void main(String[] args) {
        int[] numbers ={25,12,45,78,90,99};

        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);
        System.out.println(numbers[numbers.length-3]);
    }
}
