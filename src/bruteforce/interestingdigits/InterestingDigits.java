package bruteforce.interestingdigits;

import java.util.Arrays;

public class InterestingDigits {
    public static void main(String[] args) {
        int[] digits = digits(10);
        for (int i = 0; i < digits.length; i++) {
            if(digits[i]==1) System.out.print(i + " , ");
        }
        System.out.println(Arrays.toString(digits));
        System.out.println();
    }
    public static int[] digits(int base){

        int[] answer = new int[base];
        for (int i = 3; i < base; i++) {
            int target = i;
            int multiply = target;
            int j;
            for (j= 1; multiply*j<999; j++) {
                int num = multiply*j;
                int mod = num%base;
                int mox = num/base;
                int result = 0;
                while(mox!=0){
                    result+=mod;
                    mox=(num/base);
                    mod=(num%base);
                }
                if(result%target!=0) break;
            }
            if(multiply*j>=999){
                answer[target] = 1;
            }
        }
        return answer;
    }
}
