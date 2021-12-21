package advance.cantordust;

public class CantorDustV2 {
    public static void main(String[] args) {
        String s = getstring(3);
        System.out.println(s);
        char c = cantorCharAt(s, 0, 1);
        System.out.println(c);

        System.out.println();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                char cantorCharAt = cantorCharAt(s, i, j);
                System.out.print(cantorCharAt);
            }
            System.out.println();
        }
    }

    public static char cantorCharAt(String cantor, int i, int j){
        if (cantor.charAt(i) == 'X' && cantor.charAt(j) == 'X') return 'X';
        return '.';
    }


    public static String getstring(int times){
        if(times==0) return "X";
        String c = getstring(times - 1);
        String s = "";
        for (int i = 0; i < c.length(); i++) {
            s+=".";
        }
        return c+s+c;
    }
}
