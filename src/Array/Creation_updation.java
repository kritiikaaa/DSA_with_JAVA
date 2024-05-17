package Array;
import java.util.Scanner;

public class Creation_updation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //Creation of an array
        int[] array = new int[10];

        //Input
        for(int i=0;i<array.length;i++){
            array[i] = sc.nextInt();
         }

        //Output
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
