package bruteforce.interestingdigits;

public class InterestingDigitsV2 {
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
        int answernum = base-1;
        answer[answernum] =1;
        for (int i = 2; i < answernum; i++) {
            if(answernum%i==0){
                answer[i]=1;
            }
        }
        return answer;
    }
}
