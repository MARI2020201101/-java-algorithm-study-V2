package dynamicprogramming.knapsack;

public class Knapsack {

    public static void main(String[] args) {
        int knapsack = knapsack(0, 0, 0);
        System.out.println(knapsack); //뭔가. 한번 더 간듯??
        System.out.println("counter : " + counter); //카운터는 똑같은데. 값이 한번 더들간다? 왜다르지?
    }


    static int[] weight = {3,4,1,2,3};
    static int[] value = {2,3,2,3,6};
    static int maxValue = 0;
    static int capacity = 10;
    static int counter = 0;

    public static int knapsack(int totalWeight, int totalValue, int n){
        if(totalWeight > capacity) return totalValue;
        if(n>=weight.length) return totalValue;
        counter++;
        return maxValue = Math.max(
                knapsack(totalWeight + weight[n] , totalValue + value[n] , n++)
                , knapsack(totalWeight, totalValue , n++));
    }
}
