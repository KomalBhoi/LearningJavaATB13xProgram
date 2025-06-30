package ex_16_Arrays;

public class Lab149_ArrayCopy {
    public static void main(String[] args) {
        int[] original={5,8,9};
        int[] copy =new int[original.length];
        System.arraycopy(original,0, copy,0, original.length);
        System.out.println(copy);
    }
}
