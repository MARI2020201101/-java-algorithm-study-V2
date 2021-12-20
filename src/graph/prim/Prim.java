package graph.prim;

public class Prim {
    static int[][] edge;
    static int[][] dist;
    public static int prim(int v){
        boolean[] check = new boolean[v];
        int[] d = new int[v];
        for (int i = 0; i < v; i++) {
            d[i] = Integer.MAX_VALUE;
        }
        int ret = 0;
        d[0] = 0;
        check[0] = true;


        for (int i = 1; i < v; i++) {
            int now = 0;
            int nowd = Integer.MAX_VALUE;

            for (int j = 0; j < v; j++) {
                if(nowd > d[j] && !check[now]){
                    now = j;
                    nowd = d[j]; //거리가 제일 작은 노드를 선택한다.
                }
            }
            if(nowd==Integer.MAX_VALUE) return 0;
            check[now] = true;
            ret+=nowd;

            for (int j = 0; j < edge[now].length; j++) {
                int next = edge[now][j];
                int nextd = dist[now][j];

                if(nextd < d[next]){
                    d[next] = nextd;
                }
            }
        }




        return ret;
    }
}
