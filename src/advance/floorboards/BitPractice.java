package advance.floorboards;

public class BitPractice {
    public static void main(String[] args) {
        System.out.println(1<<8);
        // 1 -> 100000000
        System.out.println(8<<1);//지정한 만큼 왼쪽으로 비트를 옮긴다..
        //1000 -> 10000
        System.out.println(1>>8);
        // 1 -> 00000000
        System.out.println(8>>1);
        // 1000 -> 0100
    }
}
