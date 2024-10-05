package Recursion;

public class lastOccuranceInArray {
    public static int lastOccurance(int arr[], int key, int i){
        //Base Case
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurance(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,4,3,2};
        System.out.println(lastOccurance(arr, 3,0));
    }
}
