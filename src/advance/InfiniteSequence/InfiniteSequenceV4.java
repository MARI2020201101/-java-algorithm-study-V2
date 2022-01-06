package advance.InfiniteSequence;

public class InfiniteSequenceV4 {
    public static void main(String[] args) {
        System.out.println(calc(10000000,2,3,10000000,10000000));
        System.out.println(calc(12,2,3,1,0));
    }

    static long[] dp;
    public static long calc(long n, int p, int q, int x, int y){
        dp = new long[(int)n+1];
        dp[0] = 1;
        if(dp[(int)n]!=0) return dp[(int)n];
        else{
            int nexta = (int) Math.max(0,(n / p - x));
            int nextb = (int) Math.max(0,(n / q - y));
            dp[(int)n] = dp[nexta] + dp[nextb];
            //전부다 채워넣는게 아니라서.. 이런식으로 할꺼면. dynamic programming 으로...
            return dp[(int)n];
        }
    }

}
