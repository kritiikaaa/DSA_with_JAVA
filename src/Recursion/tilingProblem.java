package Recursion;

public class tilingProblem {
    public static int tilingProblem(int n){
        //Base Case
        if(n == 0 || n == 1){
            return 1;
        }
        //Vertical choice
        int fnm1 = tilingProblem(n-1);
        //Horizontal choice
        int fnm2 = tilingProblem(n-2);

        int totWays = fnm1 + fnm2;
        return totWays;
    }

    public static void main(String[] args) {
        System.out.println(tilingProblem(4));
    }
}
