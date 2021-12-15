package dynamicprogramming;

public class KnapsackV2 {

    public static void main(String[] args) {
        knapsack(0,0,0);
        System.out.println(maxValue);
        System.out.println("counter : " + counter);
    }


    static int[] weight = {3,4,1,2,3};
    static int[] value = {2,3,2,3,6};
    static int maxValue = 0;
    static int capacity = 10;
    static int counter = 0;

    public static void knapsack(int totalWeight, int totalValue, int n){
        if(totalWeight > capacity) return ;
        if(n>=weight.length) return ;
        maxValue = Math.max(totalValue,maxValue);
        counter++;
        knapsack(totalWeight + weight[n], totalValue + value[n], n++);
        knapsack(totalWeight, totalValue, n++);
    }
}
