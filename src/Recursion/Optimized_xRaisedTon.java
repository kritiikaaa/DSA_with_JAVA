package Recursion;

public class Optimized_xRaisedTon {
    public static int optimizedPower(int x, int n){
        //Base Case
        if(n == 0){
            return 1;
        }
        int halfPowerSq = optimizedPower(x, n/2)*optimizedPower(x,n/2);
        //n is odd
        if(n%2 != 0){
            halfPowerSq = x*halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String[] args) {
        System.out.println(optimizedPower(4,3));
    }
}
