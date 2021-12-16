package dynamicprogramming.knapsack;

public class KnapsackV5 {

    public static void main(String[] args) {
        System.out.println(knapsack());
        for (int i = 0; i < memo.length; i++) {
            for (int j = 0; j < memo[0].length; j++) {
                System.out.print(memo[i][j] + " ");
            }
            System.out.println();
        }
    }


    static int[] weight = {3,4,1,2,3};
    static int[] value = {2,3,2,3,6};
    static int capacity = 10;
    static int memo[][] = new int[weight.length+1][capacity+1];


    public static int knapsack(){
        int ret= 0;
        for (int i = 0; i < weight.length; i++) {
            for (int j = 0; j < capacity+1; j++) {
                //모든 경우의 수를 구해서 최적의 값을 갱신해나간다.
                if(j+weight[i] <= capacity){ //일단 들어가는지를 검증해보고
                    //최적의 값을 메모해둔다.
                    System.out.println(" >> "+ memo[i+1][j+weight[i]]); //걍 다 0 이네...

                    //if문 통과했을경우 들어갈 최적의 값 = 이전 노드에 value를 더 넣은 값
                    memo[i+1][j+weight[i]] = Math.max(memo[i+1][j+weight[i]] , memo[i][j] +value[i]);

                    //최종적으로 리턴해야할 최고치를 갱신.
                    ret = Math.max(ret, memo[i+1][j+weight[i]]);
                }
            }
        }
        return ret;
    }
}
