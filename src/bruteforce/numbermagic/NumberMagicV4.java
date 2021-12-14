package bruteforce.numbermagic;

public class NumberMagicV4 {

    public static void main(String[] args) {
        String answer = "YNYY";
        System.out.println(theNumber(answer));
    }

    static String[] N = {
            "YYYY",
            "YYYN",
            "YYNY",
            "YYNN",
            "YNYY",
            "YNYN",
            "YNNY",
            "YNNN",
            "NYYY",
            "NYYN",
            "NYNY",
            "NYNN",
            "NNYY",
            "NNYN",
            "NNNY",
            "NNNN"
    };

    public static int theNumber(String answer){
        for (int i = 0; i < N.length; i++) {
            if(answer.equals(N[i])) return i+1;
        }
        return -1;
    }

}
