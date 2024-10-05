package Recursion;

public class firstOccuranceInArray {
    public static int firstOccurance(int arr[], int key, int i){ //i = starting index
        //Base Case
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurance(arr,key, i+1);
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        System.out.println(firstOccurance(arr,3, 0));
    }
}
