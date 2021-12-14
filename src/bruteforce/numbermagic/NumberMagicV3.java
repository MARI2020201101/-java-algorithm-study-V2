package bruteforce.numbermagic;

public class NumberMagicV3 {

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
            String tmp = "";
            for(int j = 0; j < 4 ; j++){
                tmp += N[j].charAt(i);
            }
            if(tmp.equals(answer)) return i+1;
        }
        return -1;
    }

}
