package Recursion;

public class printInIncreasingOrder {
    public static void printInc(int n){
        //Base Case
        if(n==1){
            System.out.println(n);
            return;
        }
        printInc(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n = 10;
        printInc(n);
    }
}
