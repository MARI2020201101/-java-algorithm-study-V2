package dynamicprogramming;

public class KnapsackV5 {

    public static void main(String[] args) {
        System.out.println(knapsack());
    }


    static int[] weight = {3,4,1,2,3};
    static int[] value = {2,3,2,3,6};
    static int capacity = 10;
    static int memo[][] = new int[6][14];


    public static int knapsack(){
        int ret= 0;
        for (int i = 0; i < weight.length; i++) {
            for (int j = 0; j <= capacity; j++) {
                if(j+weight[j] <= capacity){
                    memo[i+1][j+weight[i]] = Math.max(memo[i+1][j+weight[i]] , memo[i][j] +value[i]);
                    ret = Math.max(ret, memo[i+1][j+weight[i]]);
                }
            }
        }
        return ret;
    }
}
