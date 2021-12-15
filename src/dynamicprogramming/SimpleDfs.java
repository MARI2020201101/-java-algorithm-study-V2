package dynamicprogramming;

public class SimpleDfs {

    public static void main(String[] args) {
        System.out.println(simpleDfs(0,0));
    }
    //(4,5)로 가는 경우의 수 구하기
    static int i = 4;
    static int j = 5;
    public static int simpleDfs(int nowi, int nowj){
        if(nowi>i || nowj>j) return 0;
        if(nowi==i && nowj==j) return 1;
        return simpleDfs(nowi+1,nowj) + simpleDfs(nowi, nowj+1);
    }
}
