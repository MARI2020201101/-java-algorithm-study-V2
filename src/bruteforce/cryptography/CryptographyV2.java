package bruteforce.cryptography;

public class CryptographyV2 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        long result = encrypt(numbers);
        System.out.println(result);

        int[] numbers2 = {1,3,2,1,1,3};
        long result2 = encrypt(numbers2);
        System.out.println(result2);
    }
    public static long encrypt(int[] numbers){

        int min = numbers[0]; //+1했을때 가장 효용이 크게 늘어나는 것은 결국 최솟값을 선택하는 것이다.
        for (int i = 1; i < numbers.length; i++) {
            min = Math.min(min, numbers[i]);
        }

        int max = min+1;
        for (int i = 0; i < numbers.length; i++) {
            max*=numbers[i];
        }
        max/=min;
        return max;
    }
}
