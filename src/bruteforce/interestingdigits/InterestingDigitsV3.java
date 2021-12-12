package bruteforce.interestingdigits;

public class InterestingDigitsV3 {
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
        for (int i = 3; i < base; i++) {
            int n = i;
            for (int j = base; j < 1000; j++) {
                if(j%n==0){ //3의 배수이다.
                    int result = 0;
                    int kk= (int)Math.log10(j);
                    for (int k = 0; k < kk; k++) {
                        int mod = j%base;
                        result += mod;
                        j/=base;
                    }
//                      int mod = j%base;
//                      int mox = j/base;
//                    while(mox!=0){
//                        result+=mod;
//                        mod=j%base;
//                        mox=j/base;
//                    }
                    if(result%n==0){
                        answer[j]=1;
                    }
                }
            }
        }
        return answer;
    }
}
