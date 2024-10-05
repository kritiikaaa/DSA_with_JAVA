package Recursion;

public class fibonacci {
    public static int fibo (int n){
        if(n==0 || n==1){
            return n;
        }
        int fn = fibo(n-1) + fibo(n-2);
        return fn;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(fibo(n));
    }
}
