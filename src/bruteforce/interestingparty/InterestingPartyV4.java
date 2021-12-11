package bruteforce.interestingparty;

import java.util.HashMap;
import java.util.Map;

public class InterestingPartyV4 {
    public static void main(String[] args) {
        String[] first = {"fishing" ,"gardening","swimming","fishing"};
        String[] second = {"hunting","fishing","fishing","biting"};

        int result = bestInvitation(first, second);
        System.out.println(result);

        String[] first2 = {"snakes" ,"programming","cobra","monty"};
        String[] second2 = {"python","python","anaconda","python"};

        int result2 = bestInvitation(first2, second2);
        System.out.println(result2);

    }

    public static int bestInvitation(String[] first, String[] second){
        Map<String,Integer> topics = new HashMap<>();
        for (int i = 0; i < first.length; i++) {
            topics.put(first[i], 0);
            topics.put(second[i], 0);
        }//일단 0으로 초기화를 해두고.

        for (int i = 0; i < first.length; i++) {
            topics.put(first[i], topics.get(first[i])+1);
            topics.put(second[i], topics.get(second[i])+1);
        }

        int mostPopular = 0;
        for (Integer value : topics.values()) {
            mostPopular = Math.max(value, mostPopular);
        }

        return mostPopular;
    }
}
