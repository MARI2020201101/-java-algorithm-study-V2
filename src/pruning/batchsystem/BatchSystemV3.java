package pruning.batchsystem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BatchSystemV3 {

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
        boolean[] isDone = new boolean[duration.length];
        int answerCount = 0;

        while(answerCount< user.length){

            String next = "";
            for (int n = 0; n < user.length; n++) {
                if(! isDone[n]){ //계속 false 맨마지막 애가 들어간다 - // n번째 유저
                    next = user[n];
                }
            }
            System.out.println(next);
            for (int i = 0; i < user.length; i++) {
                if(user[i].equals(next)){
                    isDone[i] = true;
                    answer[answerCount++] = i;//해쉬맵은 기본적으로 사전정렬해주니까
                    //중복이 있을경우 equals 메소드 불린만큼 들어간다
                }
            }
        }
        System.out.println(Arrays.toString(answer));


        return null;
    }
}
