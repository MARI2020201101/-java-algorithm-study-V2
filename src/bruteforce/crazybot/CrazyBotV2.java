package bruteforce.crazybot;

public class CrazyBotV2 {
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
        if(GRID[x][y]) return 0;
        if(n==0) return 1;


        GRID[x][y] = true;

        for (boolean[] booleans : GRID) {
            for (boolean aBoolean : booleans) {
                if(aBoolean) System.out.println();
                System.out.print(aBoolean);
            }
            System.out.println();
        }
        double ret = 0;
        for (int i = 0; i < 4; i++) {
            ret += dfs(x+VX[i], y+VY[i], n-1 ) * PROBABILITY[i];
        }
        GRID[x][y] = false;

        return ret;
    }

}
