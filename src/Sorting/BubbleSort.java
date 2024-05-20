package Sorting;
public class BubbleSort {
    public static void bubbleSort(int[] arr){ //0(n^2)
        for(int i=0;i<arr.length; i++){
            for(int j=0; j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr= {5,4,3,2,1};
        System.out.println("Original Array:");
        for(int i=0; i<5;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        bubbleSort(arr);
        System.out.println("Sorted Array:");
        for(int i=0; i<5;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
