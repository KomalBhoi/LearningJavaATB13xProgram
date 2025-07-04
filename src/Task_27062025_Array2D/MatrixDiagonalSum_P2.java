package Task_27062025_Array2D;

public class MatrixDiagonalSum_P2 {
    public static void main(String[] args) {

        int rows =3;

        for(int i=1;i<=rows;i++){
            // Print Spaces
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            // Print Stars
            for(int k=1;k<=2*i -1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
