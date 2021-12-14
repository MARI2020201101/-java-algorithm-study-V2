package bruteforce.numbermagic;

public class NumberMagic {

    public static void main(String[] args) {
        String answer = "YNYY";
        System.out.println(theNumber(answer));
    }

    static int[] A = {1,2,3,4,5,6,7,8};
    static int[] B = {1,2,3,4,9,10,11,12};
    static int[] C = {1,2,5,6,9,10,13,14};
    static int[] D = {1,3,5,7,9,11,13,15};

    public static int theNumber(String answer){

        for (int i = 0; i < 16; i++) {
            if(check(A, i) != answer.charAt(0))continue;
            if(check(B, i) != answer.charAt(1))continue;
            if(check(C, i) != answer.charAt(2))continue;
            if(check(D, i) != answer.charAt(3))continue;

            return i;
        }
        return -1;
    }
    private static char check(int[] N, int i){
        for (int n : N) { //해당 숫자와 같다면 Y를 리턴한다.
            if(i==n) return 'Y';
        }
        return 'N';
    }
}
