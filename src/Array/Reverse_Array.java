package Array;
import java.util.*;
public class Reverse_Array {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("Given araay:"+ Arrays.toString(arr));
        reverse(arr);
        System.out.println("Reversed araay:"+ Arrays.toString(arr));
    }

    public static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        //Two pointers approach - Time complexity= O(n), space complexity = O(1)
        while(start<end) {

            //swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
