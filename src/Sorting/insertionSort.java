package Sorting;

import java.util.Arrays;

public class insertionSort {

    public static void insertion_Sort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j]=temp;
                } else{
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};
        System.out.println("Original array: " + Arrays.toString(arr));
        insertion_Sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
