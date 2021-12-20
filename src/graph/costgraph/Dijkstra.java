package graph.costgraph;

import java.util.LinkedList;
import java.util.Queue;

public class Dijkstra {
    static int[][] edge;
    static int[][] dist;
    public static int dijkstra(int from, int to, int v){
        int[] d = new int[v]; //from에서 해당 노드까지의 최소비용을 담을 dp테이블
        for (int i = 0; i < d.length; i++) {
            d[i] = Integer.MAX_VALUE;
        }
        d[from] = 0;
        boolean[] checked = new boolean[v]; //한번 방문한 노드는 다시 가지 않는다.

        for (int i = 0; i < v; i++) { //모든 노드로의 최소거리를 알아야내야 한다.
            int now = 0;
            int dnow = Integer.MAX_VALUE;
            for (int j = 0; j < v; j++) {
                if(dnow>d[j] && !checked[j]){
                    now = j;
                    dnow = d[j];
                }
            }
            if(dnow==Integer.MAX_VALUE) break; //모든 노드에 방문하였거나. 혹은 갈수없는 노드가 있거나.

            checked[now] = true;

            for (int j = 0; j < edge[now].length; j++) {
                int next = edge[now][j]; //다른 목적 노드
                int dnext = dist[now][j]; //목적노드까지의 거리.
                if(dnow + dnext < d[next]){
                    d[next] = dnow + dnext;
                }
            }
        }
        return d[to];
    }
}
