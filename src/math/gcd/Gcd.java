package math.gcd;

public class Gcd {

    public static void main(String[] args) {
        System.out.println(gcd(56,1800));
        System.out.println("연산 횟수 : " + counter);
       // System.out.println(lcm(56,1800));

    }

    static int counter = 0;
    public static int gcd(int a, int b){
        int min = Math.min(a, b);
        for(int i= min ; i>1 ; i--){
            counter++;
            if(a%i==0 && b%i==0) return i;
        }
        return -1;
    }

    public static int lcm(int a, int b){
        //largest common multiple
        int gcd = gcd(a, b);
        return (a*b)/gcd;
    }
}
