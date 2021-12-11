package bruteforce.cryptography;

public class Cryptography {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        long result = encrypt(numbers);
        System.out.println(result);

        int[] numbers2 = {1,3,2,1,1,3};
        long result2 = encrypt(numbers2);
        System.out.println(result2);
    }
    public static long encrypt(int[] numbers){
        int max = 0;

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            int n = number + 1;
            for (int j = 0; j < numbers.length; j++) {
                n*=numbers[j];
            }
            n/=number;
            max = Math.max(n,max);
        }
        return max;
    }
}
