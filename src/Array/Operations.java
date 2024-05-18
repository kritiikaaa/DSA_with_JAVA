package Array;
import java.net.StandardSocketOptions;
import java.util.*;

public class Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //size of the array
        int n = sc.nextInt();

        //Array declaration
        int[] array = new int[n];

        //Array input
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        //Array Output
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }

        //Array to string - Arrays.toString()
        for(int i=0; i< array.length;i++){
            System.out.println(Arrays.toString(array));
        }
    }
}
