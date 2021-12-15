package dynamicprogramming;

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
            }
        }
    }
}
