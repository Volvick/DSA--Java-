package Practice_question;

public class stocks {
    public static int buySellStock(int stocks[]){
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;

        for (int i = 0; i < stocks.length; i++) {
            if ( buyPrice < stocks[i] ) {
                int profit =  stocks[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                buyPrice = stocks[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int stocks[] = {7, 1, 5, 3, 6,  4};
        System.out.println(buySellStock(stocks));
    }
}
