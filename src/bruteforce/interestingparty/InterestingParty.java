package bruteforce.interestingparty;

import java.util.HashMap;
import java.util.Map;

public class InterestingParty {
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
        Map<String,Integer> popularTopic = new HashMap<>();
        for (int i = 0; i < first.length; i++) {
            String key = first[i];
            if(popularTopic.containsKey(key)){
                Integer val = popularTopic.get(key);
                popularTopic.put(key, ++val);
            }else{
                popularTopic.put(key,1);
            }
        }
        for (int i = 0; i < second.length; i++) {
            String key = second[i];
            if(popularTopic.containsKey(key)){
                Integer val = popularTopic.get(key);
                popularTopic.put(key, ++val); //미친. val++하면 넣은다음에 ++되니까 계속 1이 들어간다. 시바 ㅋㅋㅋ
            }else{
                popularTopic.put(key,1);
            }
        }

        int mostPopular=0;
        for (Integer value : popularTopic.values()) {
            mostPopular = Math.max(value, mostPopular);
        }

        return mostPopular;
    }
}
