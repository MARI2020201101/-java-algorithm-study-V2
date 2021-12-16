package dynamicprogramming.dfs;

public class SimpleDfs {

    public static void main(String[] args) {
        System.out.println(simpleDfs(0,0));
        System.out.println("counter : " + counter);//(4,5)로 가는데 연산횟수...671번.....
    }
    //(4,5)로 가는 경우의 수 구하기
    static int i = 4;
    static int j = 5;
    static int counter = 0;
    public static int simpleDfs(int nowi, int nowj){
        counter++;
        if(nowi>i || nowj>j) return 0;
        if(nowi==i && nowj==j) return 1;
        return simpleDfs(nowi+1,nowj) + simpleDfs(nowi, nowj+1);
    }
}
