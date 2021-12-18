package pruning.batchsystem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class BatchSystemV2 {
    public static void main(String[] args) {
        int[] duration = {400,100,100,100};
        String[] user = {"Danny", "Stella", "Stella", "Mac"};
        schedule(duration , user);
    }


    public static int[] schedule(int[] duration, String[] user){

        Map<String, Integer> tasks = new HashMap<>();
        for (int i = 0; i < user.length; i++) {
            tasks.put(user[i], 0);
        }
        for (int i = 0; i < user.length; i++) {
            tasks.put(user[i], tasks.get(user[i])+duration[i]);
        }
        int[] answer = new int[duration.length];
//        boolean[] isDone = new boolean[duration.length];
        int order = 0;

        for (Map.Entry<String, Integer> stringIntegerEntry : tasks.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " : " + stringIntegerEntry.getValue());
        }
        while(order!=user.length){
            String username = "";
            for (int i = 0; i < user.length; i++) {
                int counter = 0;
                username=user[i];

                for (int j = 0; j < user.length; j++) {
                    if(duration[j] < tasks.get(username)){
                       counter++;
                    }
                }
                answer[i] = counter;
                order++;
            }
        }


        System.out.println(Arrays.toString(answer));


        return null;
    }
}
