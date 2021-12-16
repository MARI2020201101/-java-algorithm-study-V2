package dynamicprogramming.badneightbors;

public class BadNeightbors {
    public static void main(String[] args) {
        int[] donations = {1,2,3,4,5,1,2,3,4,5};
        System.out.println(maxDonations(donations));

        int[] donations2 = {11,15};
        System.out.println(maxDonations(donations2));
    }
    public static int maxDonations(int[] donations){
        int max = 0;
        int totalFromZero = 0;
        int totalFromOne = 0;
        for (int i = 0; i < donations.length-1; i+=2) {
            totalFromZero+=donations[i];
        }
        for (int i = 1; i < donations.length; i+=2) {
            totalFromOne+=donations[i];
        }
        max = Math.max(totalFromZero,totalFromOne);
        return max;
    }
}
