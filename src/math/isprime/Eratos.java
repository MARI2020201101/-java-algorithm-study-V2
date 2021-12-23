package math.isprime;

import java.util.Arrays;

public class Eratos {

    public static void main(String[] args) {
        eratos(50);
    }

    public static void eratos(int n){
        boolean[] primes = new boolean[n+1];
        for (int i = 0; i < primes.length; i++) {
            primes[i] = true;
        }

        for(int i = 2; i <= n; i++){
            for (int j = i*2; j <= n; j+=i) {
                primes[j] = false;
            }
        }
        for (int i = 0; i < primes.length; i++) {
            if(primes[i]) System.out.print(i + " , ");
        }
    }
}
