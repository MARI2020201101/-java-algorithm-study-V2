package math.isprime;

public class IsPrime {

    public static void main(String[] args) {
        System.out.println(isPrime(11));
        System.out.println(isPrime(18));
    }

    public static boolean isPrime(int n){
        if(n%2==0) return false;
        for(int i = 3; i < Math.sqrt(n) ; i +=2){
            if(n%i==0) return false;
        }
            return true;
    }
}
