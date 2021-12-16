package dynamicprogramming.chessmetric;

public class ChessMetricV2 {
    public static void main(String[] args) {
        int move = move(0, 2, 3, 0, 0, 0, 0);
        System.out.println(move);
    }

    static int max = 0;
    static int[] VX = {0,1,0,-1,1,-1,1,-1,1,-1,1,-1,2,2,-2,-2};
    static int[] VY = {1,0,-1,0,1,-1,-1,1,2,2,-2,-2,1,-1,1,-1};
    public static int move(int n , int numMoves, int size , int i, int j, int endi, int endj){

        if(i>=size || j>=size || i<0 || j<0) return 0;
        if(n>=numMoves && i==endi && j==endj ) return 1;
        if(n>=numMoves ) return 0;

        int ret = 0;
        for (int k = 0; k < VX.length; k++) {
            //n을 n+1 혹은 n++ 혹은 ++n 했을때 다 다른 결과가 나와... 뭐징...
            ret += move(n++, numMoves, size , i+VX[k], j+VY[k] , endi , endj);
        }




        return Math.max(max,ret);
    }
}
