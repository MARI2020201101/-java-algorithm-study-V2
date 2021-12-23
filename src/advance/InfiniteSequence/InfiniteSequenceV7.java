package advance.InfiniteSequence;

public class InfiniteSequenceV7 {
    public static void main(String[] args) {
        System.out.println(calc(10000000,2,3,10000000,10000000));
        System.out.println(calc(12,2,3,1,0));
    }

    static long[] dp ;
    static int MAX = (int)1e6;
    public static long calc(long n, int p, int q, int x, int y){
        dp = new long[MAX];
        return recur(n,p,q,x,y);
    }

    private static long recur(long n, int p, int q, int x, int y) {
        if(n<=0) return 1;
        //n이 작을수록 더 잘게잘게 부수어지므로 이때부터 메모화를 사용. 메모리를 효율적으로 활용하도록 한다
        if(n <= MAX){
            if(dp[(int)n]!=0) return dp[(int) n];
            dp[(int) n] = recur(n/p -x, p, q, x, y) + recur(n/q -y, p, q, x, y);
        }
        return recur(n/p -x, p, q, x, y) + recur(n/q -y, p, q, x, y);
    }

}
