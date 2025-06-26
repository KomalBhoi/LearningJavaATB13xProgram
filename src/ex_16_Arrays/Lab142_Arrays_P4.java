package ex_16_Arrays;

import java.util.Arrays;

public class Lab142_Arrays_P4 {
    public static void main(String[] args) {
        int[] marks ={51,100,91,87,90};

        for(int i=0;i < marks.length;i++){
            System.out.println(marks[i]);
        }

        System.out.println("-----------------");
        Arrays.sort(marks);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
    }
}
