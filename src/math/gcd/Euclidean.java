package math.gcd;

public class Euclidean {

    public static void main(String[] args) {
        System.out.println(gcd(56,1800));
        System.out.println("연산횟수 : " + counter);
    }

    static int counter = 0;
    public static int gcd(int a, int b){
        counter++;
        int smaller = Math.min(a, b);
        int greater = Math.max(a,b);
        if(greater%smaller==0) return smaller;
        else return gcd(smaller, greater%smaller);
    }
}
