package graph.isconnect;

import java.util.LinkedList;
import java.util.Queue;

public class IsConnect {
    
    static int[][] edge; //i는 노드의 갯수, j는 엣지의 갯수, 해당 값에는 연결되어있는 다음 노드의 idx가 들어간다
    //from : 시작노드 , to : 목표노드 , v : 노드의 갯수
    public static boolean isConnect(int from, int to, int v){
        boolean[] dp = new boolean[v]; //해당 노드와 노드가 연결되어 있는지 기록해두는 dp 테이블
        Queue<Integer> queue = new LinkedList<>();
        queue.add(from);
        dp[from] = true;
        while(! queue.isEmpty()){
            Integer now = queue.poll();
            for (int i = 0; i < edge[now].length; i++) {
                int next = edge[now][i];
                if(dp[next]) continue;
                if(next == to) return true;
                dp[next] = true;
                queue.add(next);
            }
        }
        return false;
    }
}
