package advance.InfiniteSequence;

public class InfiniteSequenceV6 {
    public static void main(String[] args) {
        System.out.println(calc(10000000,2,3,10000000,10000000));
        System.out.println(calc(12,2,3,1,0));
    }

    static long[] dp ;
    
    public static long calc(long n, int p, int q, int x, int y){
        dp = new long[(int)n+1]; //일단 배열자체는 한번만 만들고 내부적 메소드 호출해서 떤져!!
        return recur(n,p,q,x,y);
    }

    private static long recur(long n, int p, int q, int x, int y) {
        if(n<=0) return 1;
        if(dp[(int)n]!=0) return dp[(int) n];

        return dp[(int) n] = recur(n/p -x, p, q, x, y) + recur(n/q -y, p, q, x, y);
    }

}
