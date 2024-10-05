package Recursion;

public class xRaisedTon {
    public static int power(int x, int n){
        //Base Case
        if(n == 0){
            return 1;
        }
        return x*power(x,n-1);
    }

    public static void main(String[] args) {
        System.out.println(power(4,3));
    }
}
