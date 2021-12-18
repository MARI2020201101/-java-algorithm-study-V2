package pruning.hamiltonpath;

public class HamiltonPath {
    public static void main(String[] args) {
        roads = new String[]{"NYN", "YNN", "NNN"};
        System.out.println(countPaths(roads));

    }

    static String[] roads;
    static boolean[] visited;
    static int[] connect;
    public static int countPaths(String[] roads) {
        int group =0, free = 0;
        visited = new boolean[roads.length];
        connect = new int[roads.length];

        for (int i = 0; i < roads.length; i++) {
            int y = 0;
            for (int j = 0; j < roads[i].length(); j++) {
                if(roads[i].charAt(j)=='Y'){
                    if(2<++y) return 0;
                }
                connect[i] = y;
            }
        }
        // all - to - all을 구해야 하므로 노드의 갯수만큼. dfs
        for (int i = 0; i < connect.length; i++) {
            if(connect[i]==0){
                visited[i] = true;
                free++;
            }else{
                group++;
                dfs(i);
            }
        }


        //아 이렇게. '가야만 하는 경로' 로만 축약하니까 훨씬 DFS가 쭈는 구나....짱이넴....
        for (int i = 0; i < visited.length; i++) {
            if(!visited[i]) return 0;
        } //그래서 갈수있는 경로로 다 돌았는데. 못간 노드가 있다? -> 이어지는 edge가 없다는 것. 실패!
        int sum = 1;
        for (int i = 0; i < group+free; i++) {
            sum *=(i+1);
        }
        for (int i = 0; i < group; i++) {
            sum*=2;
        }
        return sum;
    }

    //one - to - all로 방문한다.
    private static void dfs(int city) {//여기가 이해가 안됨....
        visited[city] = true;
        for (int i = 0; i < roads.length; i++) {
            //갈수 있는 경로가 있고              // 아직 방문하지 않은 노드이면
            if(roads[city].charAt(i)=='Y' && ! visited[i]) dfs(i); //방문을 한다.
        }
    }
}
