package bruteforce.interestingparty;

import java.util.*;
import java.util.stream.Collectors;

public class InterestingPartyV2 {
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
        Set<String> set = new HashSet<>();
        List<String> list1 = Arrays.stream(first).collect(Collectors.toList());
        List<String> list2 = Arrays.stream(second).collect(Collectors.toList());
        set.addAll(list1);
        set.addAll(list2);

        int input = first.length*2;
        return input-set.size()+1;
    }
}
