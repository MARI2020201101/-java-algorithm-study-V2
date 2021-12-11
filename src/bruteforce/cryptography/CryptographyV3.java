package bruteforce.cryptography;

import java.util.Arrays;

public class CryptographyV3 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        long result = encrypt(numbers);
        System.out.println(result);

        int[] numbers2 = {1,3,2,1,1,3};
        long result2 = encrypt(numbers2);
        System.out.println(result2);
    }
    public static long encrypt(int[] numbers){

        Arrays.sort(numbers);
        numbers[0]++;

        long max =1;
        for (int i = 0; i < numbers.length; i++) {
            max*=numbers[i];
        }
        return max;
    }
}
