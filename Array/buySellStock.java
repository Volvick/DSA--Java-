public class buySellStock {
    public static int buySellStock(int stock[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit=0;
        for (int i = 0; i < stock.length; i++) {
            if (buyPrice<stock[i]) {
                int profit = stock[i] - buyPrice;//today's profit
                maxProfit= Math.max(maxProfit, profit);
            }
            else{
                buyPrice=stock[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int stock[] = { 7, 10, 1, 3, 6, 4 };
        System.out.println(buySellStock(stock));
    }
}