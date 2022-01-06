package advance.InfiniteSequence;

import java.util.Arrays;

public class InfiniteSequenceV2 {
    public static void main(String[] args) {
       // System.out.println(calc(10000000,2,3,10000000,10000000));
        System.out.println(calc(12,2,3,1,0));
        System.out.println(Arrays.toString(dp));
    }


    static long[] dp;
    public static long calc(long n, int p, int q, int x, int y){
        dp = new long[(int)n+1];
        dp[0] = 1;
        int N = 1;
        while(N < n){
            dp[N]=dp[N-1]*p +x + dp[N-1]*q +y;
        }
        return N;
    }

}
