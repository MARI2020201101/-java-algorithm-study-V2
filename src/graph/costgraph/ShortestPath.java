package graph.costgraph;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPath {

    static int[][] edge; //i는 노드, j는 엣지, 들어있는 값은 연결된 다음 노드의 i
    static int[][] dist; //i는 노드, j는 엣지, 들어있는 값은 해당 엣지의 비용(cost)
    public static int shortestPath(int from, int to, int v){ //v는 노드의 갯수.
        int[] d = new int[v];
        for (int i = 0; i < d.length; i++) {
            d[i] = Integer.MAX_VALUE;
        }
        boolean[] inQueue = new boolean[v];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(from);
        inQueue[from] = true;
        d[from] = 0;
        while(! queue.isEmpty()){
            Integer now = queue.poll();
            inQueue[now] = false;
            for (int i = 0; i < edge[now].length; i++) {
                int next = edge[now][i];
                int cost = d[now] + dist[now][i];
                if(cost < d[next]){ //더 나은 거리로 업데이트 한다.
                    d[next] = cost;

                    if(! inQueue[next]){ //큐에 두번 넣을 필요는 없다. 
                        queue.add(next);
                        inQueue[next] = true;
                    }
                }

            }
        }
        return d[to];
    }
}
