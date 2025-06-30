package ex_16_Arrays;

public class Lab148_Arrays_FindElement_LinearSearch {
    public static void main(String[] args) {
        int[] a= {25,65,12,80,45};
        int target =65;

        for(int i=0;i<a.length;i++){
            if(target == a[i]){
                System.out.println(a[i]);
            }
        }

    }
}
