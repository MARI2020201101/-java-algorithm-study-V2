package pruning.batchsystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BatchSystem {

    public static void main(String[] args) {
        int[] duration = {400,100,100,100};
        String[] user = {"Danny", "Stella", "Stella" , "Mac"};
        schedule(duration,user);
    }

    public static int[] schedule(int[] duration, String[] user){
        List<Task> tasks = new ArrayList<>();
        for (int i = 0; i < duration.length; i++) {
            tasks.add(new Task(duration[i], user[i]));
        }

        tasks.sort((t1,t2)-> t1.time > t2.time ? 1 : (t1.time==t2.time? t1.name.compareTo(t2.name) : -1));


        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            task.idx=i;
        }
        tasks.forEach(t -> System.out.println(t));

        int[] result = new int[duration.length];


        for (int i = 0; i < user.length; i++) {
            String name = user[i];
            for (int j = 0; j < tasks.size(); j++) {
                Task task = tasks.get(j);
                if(name.equals(task.name)){
                    result[i] = task.idx--;//어떻게 구현하지?
                }
            }

        }

        System.out.println(Arrays.toString(result));

        return null;
    }


    static class Task{
        int time;
        String name;
        int idx;

        @Override
        public String toString() {
            return "Task{" +
                    "time=" + time +
                    ", name='" + name + '\'' +
                    ", idx=" + idx +
                    '}';
        }

        Task(int time, String name){
            this.time=time;
            this.name=name;
        }
        Task(){}
    }
}
