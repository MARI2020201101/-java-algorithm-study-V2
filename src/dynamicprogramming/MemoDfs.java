package dynamicprogramming;

public class MemoDfs {
    public static void main(String[] args) {
        System.out.println(memoDfs(0,0));
        System.out.println("counter : " + counter); //counter 횟수 59번!! 획기적으로 줄었다.
    }

    static int i = 4;
    static int j = 5;
    static int counter = 0;
    static int[][] memo = new int[i+1][j+1]; //out of index 나는데- 한번 return 해서 0으로 돌아오는 경우도 있기떔인듯.

    public static int memoDfs(int nowi, int nowj){
        counter++;
        if(nowi>i || nowj>j) return 0;
        if(nowi==i && nowj==j) return 1;
        if(memo[nowi][nowj]!=0) return memo[nowi][nowj];
        return memo[nowi][nowj] = memoDfs(nowi+1, nowj) + memoDfs(nowi,nowj+1);
    }
}
