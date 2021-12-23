package advance.InfiniteSequence;

public class InfiniteSequenceV2 {
    public static void main(String[] args) {
        System.out.println(calc(10000000,2,3,10000000,10000000));
        System.out.println(calc(12,2,3,1,0));
    }


    static long[] dp;
    public static long calc(long n, int p, int q, int x, int y){
        if(n<=0) return 1;
        return calc(n/p -x, p, q, x, y) + calc(n/q -y, p, q, x, y);
    }

}
