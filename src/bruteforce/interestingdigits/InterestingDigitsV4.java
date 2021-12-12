package bruteforce.interestingdigits;

import java.util.ArrayList;
import java.util.List;

public class InterestingDigitsV4 {
    public static void main(String[] args) {
        int[] digits = digits(10);
        for (int i = 0; i < digits.length; i++) {
            if(digits[i]==1) System.out.print(i + " , ");
        }

        System.out.println();

        int[] digits2 = digits(26);
        for (int i = 0; i < digits2.length; i++) {
            if(digits2[i]==1) System.out.print(i + " , ");
        }
    }
    public static int[] digits(int base){
        int[] answer = new int[base];

        for (int n = 2; n < base; n++) {
            boolean ok =true;
            for (int i = 0; i < base; i++) {
                for (int j = 0; j < base; j++) {
                    for (int k = 0; k < base; k++) {
                        int num = i*base*base + j*base + k;
                        int digitsum = i + j + k;
                        if(num%n == 0 && digitsum%n!=0) ok = false; break;
                    }
                    if(!ok) break;
                }
                if(!ok) break;
            }
            if(ok) answer[n]=1;
        }
        return answer;
    }
}
