package Array;
import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        //input array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //Input target
        int target = sc.nextInt();
        sc.close();

        int[] result = twosum(arr, target);
        System.out.println(Arrays.toString(result));
    }

    //brute force approach - Time Complexity - O(n^2), Space Complexity - O(1)
    public static int[] twosum(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    /*optimized Solution - Hash map

}
