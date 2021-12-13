package bruteforce.crazybot;

public class CrazyBot {
    static boolean[][] GRID = new boolean[100][100];
    static int[] VX = {1,-1,0,0};
    static int[] VY = {0,0,1,-1};

    static double[] PROBABILITY = new double[4];

    public static void main(String[] args) {
        System.out.println(getProbability(2,25,25,25,25));
    }

    public static double getProbability(int n, int east, int west , int south, int north){

        PROBABILITY[0] = east /100.0;
        PROBABILITY[1] = west /100.0;
        PROBABILITY[2] = south /100.0;
        PROBABILITY[3] = north /100.0;

        return dfs(50,50,n);
    }

    private static double dfs(int x, int y, int n) {
        if(GRID[x][y]) return 0; //지나갔던 곳이면 -> 곧바로 0을 리턴한다. 실패하였으므로 퍼센트 0이다. (가지치기)
        if(n==0) return 1; //n번 이동하는 것에 성공하여 base case에 도달하였다. 퍼센트 100이다.
        //보여줄때는 소수점이므로 1이 제일 큰 값이 됨..

        GRID[x][y] = true; //지나갔음을 표시한다.
        double ret = 0;
        for (int i = 0; i < 4; i++) {
                    //동서남북으로 이동                     //근데. 거기로 가서 성공(or 실패) 할 확률이 또 있다...허걱스...
            ret += dfs(x+VX[i], y+VY[i], n-1 ) * PROBABILITY[i];
        }
        GRID[x][y] = false; //base노드까지 도달한후 안가본 노드로 가야한다.

        return ret;
    }

}
