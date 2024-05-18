package Array;
import java.util.*;
public class Transposeof_2Dmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //Transpose
        int[][] transpose = new int[cols][rows];

        for(int i=0; i<cols; i++){
            for(int j=0; j<rows; j++){
                transpose[i][j] = matrix[j][i];
            }
        }

        for(int i=0; i<transpose.length; i++){
            for(int j=0; j<transpose[0].length; j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
