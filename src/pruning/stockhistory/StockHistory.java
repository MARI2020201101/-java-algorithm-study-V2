package pruning.stockhistory;

public class StockHistory {


    public static int maximumEarnings(int initialInvestMent, int monthlyContribution, String[] stockPrices){
        int[] buyStock = new int[stockPrices.length];
        String[] lastMonthStock = stockPrices[stockPrices.length-1].split(" ");
        for (int i = stockPrices.length-2; i >=0 ; i--) {
            String[] s = stockPrices[i].split(" ");
            int best = 0;
            for (int j = 0; j < s.length; j++) {
                int lastPrice = Integer.parseInt(lastMonthStock[j]);
                int nowPrice = Integer.parseInt(s[j]);

                
                if(lastPrice/nowPrice<0){
                    continue;
                }
            }
        }

    }
}
