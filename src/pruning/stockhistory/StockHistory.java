package pruning.stockhistory;

public class StockHistory {

    public static void main(String[] args) {
        String[] stockPrices = {
                "40 50 60",
                "37 48 55",
                "100 48 50",
                "105 48 47",
                "110 50 52",
                "110 50 52",
                "110 51 54",
                "109 49 53"
        };
        maximumEarnings(100,20,stockPrices);
        System.out.println();
        for (int i = 0; i < buyList.length; i++) {
            for (int j = 0; j < buyList[0].length; j++) {
                System.out.print(buyList[i][j] + " /////// ");
            }
            System.out.println();
        }
    }

    static double[][] buyList;
    public static int maximumEarnings(int initialInvestment, int monthlyContribution, String[] stockPrices){
        double[] buyStock = new double[stockPrices.length];
        String[] lastMonthStock = stockPrices[stockPrices.length-1].split(" ");
        buyList = new double[stockPrices.length-1][3];

        double best = 0;
        double shouldBuy = 1.0;
        for (int i = stockPrices.length-2; i >=0 ; i--) {
            String[] s = stockPrices[i].split(" ");

            for (int j = 0; j < s.length; j++) {
                double lastPrice = Double.parseDouble(lastMonthStock[j]);
                double nowPrice = Double.parseDouble(s[j]);

                double isBest = lastPrice/nowPrice;

                best = Math.max(best, isBest);

            }

            buyList[i][0] = i;
            buyList[i][1] = best;
            buyList[i][2] = shouldBuy;
            System.out.println("best " + i + "월: " + best );
        }
        return 0;
    }
}
