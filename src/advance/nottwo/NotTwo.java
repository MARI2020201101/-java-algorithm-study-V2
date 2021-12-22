package advance.nottwo;

public class NotTwo {
    public static void main(String[] args) {
        maxStones(10 ,10);
    }

    public static int maxStones(int width, int height){
        int i;int j;
        int[][] board = new int[1005][1005];
        int res = 0;

        for (i = 2; i < height + 2 ; i++) {
            for (j = 2;j< width + 2 ; j++){
                if(board[i-2][j] == 0 && board[i][j-2] == 0){
                    System.out.print("O");
                    res++;
                    board[i][j]=1;
                }else System.out.print("X");
            }
            System.out.println();
        }
        return res;
    }
}
