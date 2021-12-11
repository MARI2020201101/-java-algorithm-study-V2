package simulation.kiwijuice;

import java.util.Arrays;

public class KiwiJuiceEasyV4 {
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
            int f = fromId[i];
            int t = toId[i];
            int vol = Math.min((capacities[t] - bottles[t]), bottles[f]);

            //만약에 용량이 더 작으면 용량이고 옮길 주스양이 더 적으면 주스이다
            bottles[t] +=vol;
            bottles[f] -=vol;
        }
       return bottles;
    }
}
