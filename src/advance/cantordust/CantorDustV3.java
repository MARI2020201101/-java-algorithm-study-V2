package advance.cantordust;

public class CantorDustV3 {

    public static int occerrencesNumber(String[] pattern, int time){
        int M = pattern.length; int N = pattern[0].length();
        boolean[] a = new boolean[M]; boolean[] b = new boolean[N];
        String C = getstring(time);
        int L = C.length();
        int x,y,k;
        int p = 0 ; int q = 0;
        boolean flag = false;
        for(x=0;x<M;++x)
            for(y=0;y<N;++y)
                if(pattern[x].charAt(y)=='X')
                    a[x] = b[y] = flag = true;

        for(k=0;k+M<=L;++k){
            for(x=0;x<M;++x)
                if((C.charAt(k+x) == 'X')!=a[x]) break;
                if(x==M) ++p;
        }
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
