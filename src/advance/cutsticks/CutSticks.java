package advance.cutsticks;

public class CutSticks {
    public static void main(String[] args) {
        int[] sticks = {5,8};
        System.out.println(cutSticks(sticks, 3, 2));
    }

    public static double cutSticks(int[] sticks, int C, int K){
        double low = 0;
        double high = 1e9;


        for (int i = 0; i <100 ; i++){
            double mid = (low+high)/2;
            long cut = 0;
            long count = 0;
            for (int j = 0; j < sticks.length; j++) {
                double nextK = sticks[j] / mid; //mid 길이를 몇개나 만들 수 있니?
                cut += Math.max(0,nextK-1); //cut 번 짤라서 만들 수 있어요.
                count += nextK;
            }
            count -= Math.max(0,cut-C); //근데 C보다 마니 짜를 수는 없어요. //C는 최대 컷할수있는 횟수이기떔에요.
            if(cut >= K) low = mid;
            else high = mid;
        }
        return low;
    }
}
