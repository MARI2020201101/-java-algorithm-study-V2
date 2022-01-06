package advance.InfiniteSequence;

public class InfiniteSequence {
    public static void main(String[] args) {
        //System.out.println(calc(10000000,2,3,10000000,10000000));
        System.out.println(calc(12,2,3,1,0));
        System.out.println("count : " + count);
    }


    static int count = 0;
    public static long calc(long n, int p, int q, int x, int y){
        if(n<=0) return 1;
        count++ ;
        return calc(n/p -x, p, q, x, y) + calc(n/q -y, p, q, x, y);
    }

}
