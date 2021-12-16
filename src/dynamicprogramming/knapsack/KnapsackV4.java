package dynamicprogramming.knapsack;

public class KnapsackV4 {

    public static void main(String[] args) {
        int knapsack = knapsack(0, 0);
        System.out.println(knapsack);
        for (int i = 0; i < memo.length; i++) {
            for (int j = 0; j < memo[i].length; j++) {
                System.out.print(memo[i][j] + " ");
            }
            System.out.println();
        }
    }


    static int[] weight = {3,4,1,2,3};
    static int[] value = {2,3,2,3,6};
    static int maxValue = 0;
    static int capacity = 10;
    static int memo[][] = new int[weight.length+1][capacity+1];


    public static int knapsack(int n, int totalWeight){
        if(totalWeight > capacity) return -1;
        if(n >= weight.length) return 0;
        if(memo[n][totalWeight] >= 0) return memo[n][totalWeight];


        return memo[n][totalWeight] = Math.max(
                memo[n+1][totalWeight+weight[n]]+value[n] ,
                memo[n+1][totalWeight]) ;
    }
}
