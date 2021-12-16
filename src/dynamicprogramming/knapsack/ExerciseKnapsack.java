package dynamicprogramming.knapsack;

public class ExerciseKnapsack {

    public static void main(String[] args) {
        knapsack();
        System.out.println("maxValue : " + maxValue);
    }

    static int[] weight = {3,4,1,2,3};
    static int[] value = {2,3,2,3,6};
    static int maxWeight = 10;
    static int maxValue = 0;
    static int[][] memo = new int[weight.length+1][maxWeight+1];


    public static void knapsack(){
        for (int i = 0; i < weight.length; i++) {
            for (int j = 0; j < maxWeight+1; j++) {
                if(j+weight[i] <= maxWeight ){
                    memo[i+1][j+weight[i]] = memo[i][j] + value[i];
                    maxValue = Math.max(memo[i + 1][j + weight[i]], maxValue);
                }
            }
        }
    }

}
