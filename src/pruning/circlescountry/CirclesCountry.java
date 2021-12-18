package pruning.circlescountry;

public class CirclesCountry {


    public static void main(String[] args) {
        int[] X = {1,-3,2,5,-4,12,12};
        int[] Y = {1,-1,2,5,5,1,1};
        int[] R = {8,1,2,1,1,1,2};
        int x1 = -5, y1 = 1 , x2 = 12, y2 = 1;
        System.out.println(leastBorders(X,Y,R,x1,y1,x2,y2));
    }

    public static int leastBorders(int[] X, int[] Y , int[] R, int x1, int y1, int x2, int y2){
        int count = 0;
        for (int i = 0; i < X.length; i++) {
            double distance1 = Math.pow((x1 - X[i]), 2) + Math.pow((y1 - Y[i]), 2);
            double distance2 = Math.pow((x2 - X[i]), 2) + Math.pow((y2 - Y[i]), 2);
            double radius = Math.pow(R[i],2);
            if(distance1 < radius) count++; //해당 원 안에 있으면 카운트를 증가시키기!!^ㅁ^
            if(distance2 < radius) count++;
        }
        return count;
    }
}
