package dynamicprogramming.dfs;

public class UpperDfs {
    public static void main(String[] args) {
        upperDfs();
        System.out.println(memo[i][j]);
    }

    static int i = 4;
    static int j = 5;
    static int memo[][] = new int[i+1][j+1];


    public static void upperDfs(){
        memo[0][0] = 1 ;
        for (int k = 0; k <= i; k++) {
            for (int l = 0; l <= j; l++) {
                if(k!=0) memo[k][l] += memo[k-1][l];
                if(l!=0) memo[k][l] += memo[k][l-1];
                //해당 점으로 가는 경우의 수는 . 왼쪽에서 온 경우의 수 + 오른쪽에서 온 경우의 수를 합친 것과 같다.
            }
        }
    }
}
