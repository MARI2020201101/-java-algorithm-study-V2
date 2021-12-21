package advance.binaryflips;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryFlips {

    public static int minimalMoves(int A, int B, int K){
        if(A==0) return 0;
        if(A+B < K) return -1;
        int[] array = new int[A+B+1];
        for (int i = 0; i < array.length; i++) {
            array[i] = -1;
        }
        array[A] = 0; //A는 0의 개수, 들어있는 값은 뒤집은 카운트.
        Queue<Integer> queue = new LinkedList<>();
        queue.add(A);

        while(! queue.isEmpty()){
            Integer i = queue.poll();
            for (int j = Math.max(0,K-(A+B-i)); j <= Math.min(i,K); j++) {//이부분 도무지 이해가....
                int nextzero = i + (K - 2 * j);

                if(array[nextzero] == -1){
                    if(nextzero==0) return array[i]+1; //몇번 뒤집었는가를 카운트.
                    array[nextzero] = array[i]+1;
                    queue.add(nextzero);
                }
            }
        }
        return -1;
    }
}
