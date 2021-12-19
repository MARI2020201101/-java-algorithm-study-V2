package graph.isconnect;

public class XorPractice {
    public static void main(String[] args) {
        int a = 2 , b = 5;
        System.out.printf("(%d) ^ (%d) = %d%n", a, b, a^b); //역원을 만드는 듯??
        a = a^b;
        System.out.printf("(%d) ^ (%d) = %d%n", b, a, b^a);
        b = b^a;
        System.out.printf("(%d) ^ (%d) = %d%n", a, b, a^b);
        a = a^b;
        System.out.printf("a = %d , b = %d %n", a, b); //교체가 된다... 졸라리 신기하다....

    }
}
