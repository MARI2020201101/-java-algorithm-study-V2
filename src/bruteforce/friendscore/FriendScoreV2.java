package bruteforce.friendscore;

public class FriendScoreV2 {
    public static void main(String[] args) {
        String[] friends = {
                "NYNNN",
                "YNYNN",
                "NYNYN",
                "NNYNY",
                "NNNYN"
        };
        System.out.println(highestScore(friends));
    }
    public static int highestScore(String[] friends){
        int max = 0;

        for (int i = 0; i < friends.length; i++) {
            int count = 0;
            for (int j = 0; j < friends.length; j++) {
                if(i==j)continue;
                if(friends[i].charAt(j)=='Y'){ //직접친구
                    count++;
                }else{
                    for (int k = 0; k < friends.length; k++) { //간접친구
                        if(friends[j].charAt(k)=='Y' && friends[k].charAt(i)=='Y'){
                            count++;
                        }
                    }
                }
            }
            max = Math.max(max , count);
        }


        return max;
    }
}
