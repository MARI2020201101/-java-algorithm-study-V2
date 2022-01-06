package advance.nottwo;

public class NotTwoV3 {
    public static void main(String[] args) {
        int max = notTwo(10, 10);
        System.out.println(max);
    }

    public static int notTwo(int width, int height){
        int res = 0 ;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                res+= (((width+i)/2) * ((height+j)/2)+1)/2 ;
            }
        }
        return res;
    }
}
