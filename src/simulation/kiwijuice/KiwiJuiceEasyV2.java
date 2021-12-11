package simulation.kiwijuice;

import java.util.Arrays;

public class KiwiJuiceEasyV2 {
    public static void main(String[] args) {

        int[] capacities = {30,20,10};
        int[] bottles = {10,5,5};
        int[] fromId = {0,1,2};
        int[] toId = {1,2,0};

        int[] result = thePouring(capacities, bottles, fromId, toId);
        System.out.println(Arrays.toString(result));

        int[] capacities2 = {14,35,86,58,25,62};
        int[] bottles2 = {6,34,27,38,9,60};
        int[] fromId2 = {1,2,4,5,3,3,1,0};
        int[] toId2 = {0,1,2,4,2,5,3,1};

        int[] result2 = thePouring(capacities2, bottles2, fromId2, toId2);
        System.out.println(Arrays.toString(result2));
    }

    public static int[] thePouring(int[] capacities , int[] bottles, int[] fromId, int[] toId){

        for (int i = 0; i < fromId.length; i++) {
            int fromJuice = fromId[i];
            int toJuice = toId[i];

            int toBottle = bottles[toJuice];
            int capacity = capacities[toJuice];
            int availableAmount = capacity - toBottle;
            int fromBottle = bottles[fromJuice];

            if(availableAmount >= fromBottle){
                bottles[toJuice]+=fromBottle;
                bottles[fromJuice] = 0;
            }
            else{
                bottles[toJuice] = capacity;
                bottles[fromJuice] -= availableAmount;
            }

        }
        return bottles;
    }
}
