package advance.InfiniteSequence;

public class InfiniteSequenceV3 {
    public static void main(String[] args) {
        System.out.println(calc(10000000,2,3,10000000,10000000));
        System.out.println(calc(12,2,3,1,0));
    }


    static long[] dp;
    public static long calc(long n, int p, int q, int x, int y){
        dp = new long[(int)n+1];
        dp[0] = 1;
        for(int i = 1; i <=n ; i++){
            dp[i] = 0;

            int nexta = i / p - x;
            int nextb = i / q - y;

            if(nexta<=0) dp[i]+=1;
            else dp[i] += dp[nexta];
            if(nextb<=0) dp[i]+=1;
            else dp[i] += dp[nextb];
        }
        return dp[(int)n];
    }

}
