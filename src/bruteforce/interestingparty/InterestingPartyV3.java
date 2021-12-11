package bruteforce.interestingparty;

public class InterestingPartyV3 {
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
        //for문을 두개 돌려서 답을 찾는 brute - force방법
        int mostPopular = 0;

        for (int i = 0; i < first.length; i++) {
            int f = 0;
            int s = 0;
            for (int j = 0; j < second.length; j++) {
                if(first[i].equals(first[j])) f++;
                if(first[i].equals(second[j])) f++;
                if(second[i].equals(first[j])) s++;
                if(second[i].equals(second[j])) s++;
            }
            mostPopular = Math.max(f, mostPopular);
            mostPopular = Math.max(s, mostPopular);
        }

        return mostPopular;
    }
}
