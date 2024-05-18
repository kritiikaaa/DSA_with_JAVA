package Array;
import java.util.*;

public class TwoD_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Defining the number of rows is mandatory
        int rows=sc.nextInt();
        int cols = sc.nextInt();

        //2-D array Declaration
        int[][] array2 = new int[rows][cols];

        //2-D array input
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                array2[i][j] = sc.nextInt();
            }
        }

        //2-D array output
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(array2[i][j]+" ");
            }
            System.out.println();
        }
     }
}
