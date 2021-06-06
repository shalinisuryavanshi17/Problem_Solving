import java.util.*;
public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int matrix[][] = new int[r][c];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j]=sc.nextInt();
            }
        }
        int matrixTranspose[][] = new int[r][c];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrixTranspose[j][i]=matrix[i][j];
            }
        }
        for (int i = 0; i < matrixTranspose.length; i++) {
            for (int j = 0; j < matrixTranspose[0].length; j++) {
                System.out.print(matrixTranspose[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
