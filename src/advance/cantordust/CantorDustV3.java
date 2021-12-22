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
        //경우의 수
        // X X
        // . X
        // X .
        // . .

        for(k=0;k+M<=L;++k){ //이런식으로 겹치는 처리가 가능... 우와앙.....
            for(x=0;x<M;++x)
                if((C.charAt(k+x) == 'X')!=a[x]) break; //가로로 옮겨가면서 체크!!
            //가로 대각선으로 옮겨가면서 체크하게 된다!
                if(x==M) ++p;
        }
        for(k=0;k+N<=L;++k){
            for(x=0;x<N;++x)
                if((C.charAt(k+x) == 'X')!=a[x]) break; //세로로 옮겨가면서 체크!!
            if(x==N) ++q;
        }

        if(flag) return p*q; //X를 포함하는 경우.
        else return (p * (L-N+1) + (L-M+1) * q - p*q); //X를 포함하지 않는 경우.

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
