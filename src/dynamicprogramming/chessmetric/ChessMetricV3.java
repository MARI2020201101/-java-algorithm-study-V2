package dynamicprogramming.chessmetric;

public class ChessMetricV3 {

    public static void main(String[] args) {
        System.out.println(howMany(3,new int[]{0,0},new int[]{0,0},2));
    }


    static long[][][] ways = new long[100][100][55];
    static int[] VX = {0,1,0,-1,1,-1,1,-1,1,-1,1,-1,2,2,-2,-2};
    static int[] VY = {1,0,-1,0,1,-1,-1,1,2,2,-2,-2,1,-1,1,-1};

    public static long howMany(int size, int[] start, int[] end, int numMoves){
        int sx = start[0] , sy = start[1];
        int ex = end[0], ey = end[1];

        ways[sx][sy][0] = 1;

        for (int i = 1; i <= numMoves; i++) {
            for (int x = 0; x < size; x++) { //해당 위치까지 모든 이동가능한 경우의 수를 채우고
                for (int y = 0; y < size; y++) {
                    for (int j = 0; j < VX.length; j++) {
                        int nx = x + VX[j];
                        int ny = y + VY[j];
                        if(nx<size && ny<size && nx>=0 && ny>=0){
                            ways[nx][ny][i] += ways[x][y][i-1];
                        }
                    }
                }
            }
        }
        return ways[ex][ey][numMoves]; //결론적으로는 목적지에의 이동가능한 경우의 수를 리턴!!

    }
}
