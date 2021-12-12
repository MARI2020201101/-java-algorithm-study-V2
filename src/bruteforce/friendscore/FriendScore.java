package bruteforce.friendscore;

import java.util.*;

public class FriendScore {
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

        char[][] friendMap = new char[friends.length][friends.length];

        for (int i = 0; i < friendMap.length; i++) {
            friendMap[i] = friends[i].toCharArray();
        }

        Map<Integer, List<Integer>> friendCount = new HashMap<>();

        for (int i = 0; i < friends.length; i++) {
            friendCount.put( i, new ArrayList<>());
        }

        for (int i = 0; i < friendMap.length; i++) {
            for (int j = 0; j < friendMap.length; j++) {
                if(friendMap[i][j]=='Y'){
                    List<Integer> list = friendCount.get(i);
                    list.add(j);
                    friendCount.put( i, list);
                }
            }
        }
        List<Set<Integer>> totalFriend = new ArrayList<>();

        for (List<Integer> value : friendCount.values()) {
            Set<Integer> set = new HashSet<>();
            for (Integer f : value) {
                set.add(f);
                List<Integer> commonFriend = friendCount.get(f);
                for (Integer cf : commonFriend) {
                    set.add(cf);
                }
            }
            totalFriend.add(set);
        }

        int max = 0;
        for (Set<Integer> set : totalFriend) {
            max = Math.max(set.size(), max);
        }

        return max-1;
    }
}
