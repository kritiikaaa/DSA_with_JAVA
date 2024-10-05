package Recursion;

public class arraySortedORNot {
    public static boolean isSorted(int arr[], int i){
        // Base Case
        if(i == arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int[] arr = {2,5,4,3,1};
        System.out.println(isSorted(arr, 3));
    }
}
