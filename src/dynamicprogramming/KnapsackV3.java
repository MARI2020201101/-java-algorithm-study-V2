package dynamicprogramming;

public class KnapsackV3 {

    public static void main(String[] args) {
        int knapsack = knapsack(0, 0, 0);
        System.out.println(knapsack); //오케이 완성~~~!!! 됐당됐당!!!!!히히히히..^ㅁ^
        System.out.println("counter : " + counter);
    }


    static int[] weight = {3,4,1,2,3};
    static int[] value = {2,3,2,3,6};
    static int maxValue = 0;
    static int capacity = 10;
    static int counter = 0;

    public static int knapsack(int totalWeight, int totalValue, int n){
        if(totalWeight > capacity) return 0;
        if(n>=weight.length) return totalValue;
        counter++;
        return maxValue = Math.max(
                knapsack(totalWeight + weight[n] , totalValue + value[n] , n++)
                , knapsack(totalWeight, totalValue , n++));
    }
}
