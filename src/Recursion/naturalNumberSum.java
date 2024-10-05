package Recursion;

import java.net.StandardSocketOptions;

public class naturalNumberSum {
    public static int sum(int n){
        //base case
        if(n==1){
            return 1;
        }
        int add = n + sum(n-1);
        return add;
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
