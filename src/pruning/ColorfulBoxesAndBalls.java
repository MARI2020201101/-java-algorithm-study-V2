package pruning;

public class ColorfulBoxesAndBalls {
    public static void main(String[] args) {
        System.out.println(getMaximum(2,3,100,400,200));

    }

    public static int getMaximum(int numRed, int numBlue, int onlyRed, int onlyBlue, int bothColors){
        int max = 0;
        int smallerNum = Math.min(numRed, numBlue);
        for (int i = 0; i <= smallerNum; i++) {
            int sum = (bothColors * i * 2) + ((numRed - i) * onlyRed) + ((numBlue - i) * onlyBlue);
            max = Math.max(sum, max);
        }
        return max;
    }
}
