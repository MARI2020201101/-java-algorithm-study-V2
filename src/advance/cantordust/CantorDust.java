package advance.cantordust;

import java.util.Arrays;

public class CantorDust {

    public static void main(String[] args) {
        String s = "X.X";
        int times = 3;
        for (int i = 0; i < times; i++) {
            s = getString(s);
        }
        System.out.println(s);
    }

    public static String getString(String s){
        String white = "";
        for (int i = 0; i < s.length(); i++) {
            white+=".";
        }
        return s+white+s;
    }
    
    
}
