package bruteforce.numbermagic;

public class NumberMagicV2 {

    public static void main(String[] args) {
        String answer = "YNYY";
        System.out.println(theNumber(answer));
    }

    static String[] N = {
            "YYYYYYYYNNNNNNNN",
            "YYYYNNNNYYYYNNNN",
            "YYNNYYNNYYNNYYNN",
            "YNYNYNYNYNYNYNYN"
    };

    public static int theNumber(String answer){

        for (int i = 0; i < 16; i++) {
            if(N[0].charAt(i)!=answer.charAt(0)) continue;
            if(N[1].charAt(i)!=answer.charAt(1)) continue;
            if(N[2].charAt(i)!=answer.charAt(2)) continue;
            if(N[3].charAt(i)!=answer.charAt(3)) continue;
            return i+1; // i+1 해야 카드의 숫자값으로 맵핑된다 ( 지금은 인덱스.)
        }
        return -1;
    }

}
