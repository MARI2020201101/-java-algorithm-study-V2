package advance.floorboards;

public class FloorBoardsCopy {

    public static int layout(String[] room){
        int i,j,k, len = room[0].length();
        int MAX = 99999;
        int[][] dp = new int[room.length+1][1<<len]; //len 의 길이 만큼을 저장할 수 있는 비트들의 공간을 만들어줘야함..

        for(i=0;i<=room.length;i++)
            for(j=0;j<(1<<len);j++)
                    dp[i][j] = MAX; //적당히 초기화
        dp[0][0] = 0;


        for(i = 0; i < room.length; i++){
            int field = 0; //장애물
            for(j=0; j<len;j++){
                if(room[i].charAt(j)=='#') field++;
            }
            for(j=0; j < (1<<len); j++){
                if(dp[i][j]==MAX) continue;
                for(k=0; k < (1<<len); k++){
                    if(((field)&k) != 0) continue; //해당 자리를 앤드연산한 결과가. 다르다면. -> 장애물이 있다????뭐야 이건??
                    dp[i+1][k] = Math.min(dp[i+1][k], dp[i][j]+ addLine(j,k,field,len));
                }
            }
        }
        int res = MAX;
        for(i=0 ; i < (1<<len); i++){
            res += Math.min(res, dp[room.length][i]);
        }
        return res;
    }


    private static int addLine(int prev, int now, int field, int n){
        int i;
        int res = 0;
        boolean flag = false;
        for(i = 0; i < n ; i++){
            if((((now>>i)&1) == 1)){
                if(((prev>>i)&1)!=1) res++;
                flag = false;
            }
            else{
                if((((field>>i)&1) == 1)) flag = false;
                else{
                    if(! flag) res++;
                    flag = true;
                }
            }
        }
        return res;
    }
}
