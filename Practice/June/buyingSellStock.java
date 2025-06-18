package June;

public class buyingSellStock {
  public static void main(String[] args) {
    int stock[] = { 7, 10, 1, 3, 6, 4 };
    int buyPrice = Integer.MAX_VALUE;
    int maxProfit = 0;
    for (int i = 0; i < stock.length; i++) {
      if (stock[i]>buyPrice) {
        int profit = stock[i] - buyPrice;
        maxProfit = Math.max(maxProfit, profit);
      }
      else{
        buyPrice = stock[i];
      }
    }
    System.out.println(maxProfit);
  }
}
