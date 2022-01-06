package advance.floorboards;

public class FloorBoards {
    public static int layout(String[] room){
        int recur = recur(room, 0, 0);
        return recur;
    }
    private static int recur(String[] room, int i, int j){
        //이건...char로 쪼개는게. 낫겠다...
        int maxTileWidth = 0;
        if(room[i].charAt(j) == '|' || room[i].charAt(j) == 'ㅡ' || room[i].charAt(j) == '#'){
            return maxTileWidth;
        }
        maxTileWidth++;
        int goDown = recur(room, i + 1, j);
        int goRight = recur(room, i, j + 1);
        int max = Math.max(goDown, goRight);
        if(max == goDown){
            for (int k = max; k>0 ; k--){
                room[k]= "|"+room[k].indexOf(j+1,room[k].length());
            }
        }
        else{
            String tile = "";
            for (int k = max; k>0 ; k--){
                tile+="ㅡ";
            }
            room[i] = tile + room[i].substring(max);
        }
        return 0;
    }
}
