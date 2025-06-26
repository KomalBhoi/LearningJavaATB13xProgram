package Task_25062025;

public class Lab144_SecHighestNo_P1 {
    public static void main(String[] args) {
        int[] array={91,25, 55, 35,89};
        int size = array.length; // 5
        int temp;

        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println("Second largest number is:" +array[size-2]);
    }
}
