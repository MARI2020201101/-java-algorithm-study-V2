package dynamicprogramming.handsshaking;

import java.util.Arrays;

public class HandsShaking {

    public static void main(String[] args) {
        System.out.println(countPerfect(10));
    }

    public static int countPerfect(int n){
        int[] shake = new int[n/2+1];
        shake[0] = 1;
        for (int i = 1; i <= n/2; i++) { //시행횟수는 사람수/2가 된다.
            int tmp = 0;
            for (int j = 0; j < i; j++) { //해당 배열 양끝 대칭으로 더하게 된다.
               tmp += shake[j]*shake[i-j-1];
            }
            shake[i] = tmp;
        }
        System.out.println(Arrays.toString(shake));
       return shake[n/2];
    }
}
