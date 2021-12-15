package dynamicprogramming;

public class Knapsack {

    public static void main(String[] args) {
        int knapsack = knapsack(0, 0, 0);
        System.out.println(knapsack);
    }


    static int[] weight = {3,4,1,2,3};
    static int[] value = {2,3,2,3,6};
    static int maxValue = 0;
    static int capacity = 10;

    public static int knapsack(int totalWeight, int totalValue, int n){
        if(totalWeight > capacity) return totalValue;
        if(n>=weight.length) return totalValue;

        return maxValue = Math.max(
                knapsack(totalWeight + weight[n] , totalValue + value[n] , n++)
                , knapsack(totalWeight, totalValue , n++));
    }
}
