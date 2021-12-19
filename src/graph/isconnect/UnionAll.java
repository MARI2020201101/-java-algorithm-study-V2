package graph.isconnect;

public class UnionAll {
    static int[] uni;

    //a가 루트 노드인지를 판별한다.
    public static int root(int a){
        if(uni[a]<0) return a;
        return root(uni[a]);
    }

    //두 노드 a, b의 그룹을 연결하여 하나의 그룹으로 만든다.
    public static boolean connect(int a, int b){
        a = root(a); //루트노드를 찾는다.
        b = root(b);
        if(a==b) return false; //원래부터 같은 그룹이었던 경우.

        //a쪽을 더 큰 그룹으로 만들 계획이다.
        //따라서 b그룹이 더 크다면 더 큰 그룹의 루트가 a가 되도록 한다.
        //루트 노드의 값에는 속한 노드의 카운트를 음수로 한 값이 들어있다.
        if(uni[a] > uni[b]){
            a^=b;
            b^=a;
            a^=b;
        }
        uni[a] = uni[a] + uni[b];
        uni[b] = a; //부모노드의 인덱스를 넣어준다.

        return true;
    }

    public static boolean isConnect(int a, int b){
        return root(a)==root(b);
    }

    public static int size(int a){
        return -uni[root(a)];
    }
}
