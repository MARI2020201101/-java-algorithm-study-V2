package advance.nottwo;

public class NotTwoV2 {
    public static void main(String[] args) {
        notTwoPractice(10,10);
        int i = notTwoPractice2(10, 10);
        System.out.println(i);
    }

    public static int notTwoPractice(int width, int height){
        int res = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println((width+i)/2);
                System.out.println((height+j)/2);
                System.out.printf("i = %d , j = %d%n", i ,j);

                System.out.println(((width+i)/2) * ((height+j)/2+1));

            }
        }
        return res;
    }
    public static int notTwoPractice2(int width, int height){
        int res = 0;
        res += width * (height/2);
        if(height%2==1){
            if(width%2==1) res+= (width+1)/2;
            else res+= (width+2)/2;
        }
        return res;
    }
}
