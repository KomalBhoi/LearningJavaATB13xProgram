package Task_27062025_Array2D;

public class Transpose_Matrix_P1 {
    public static void main(String[] args) {

        int[][] matrix ={
                {1,2,3},
                {4,5,6}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transpose=new int[cols][rows];

        // Transposing the matrix
        for(int i=0;i <rows;i++){
            for(int j=0;j< cols;j++){
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Transposed Matrix");
        for(int i=0;i<cols;i++){
            for(int j=0;j < rows;j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
