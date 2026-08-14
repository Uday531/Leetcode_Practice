package day65;

public class BestTimeToBuyAndSellAStock_Revison {
    static void main() {
        int[] a={7,1,5,3,6,4};
        System.out.println(maxProfit(a));
    }
    public static int maxProfit(int[] prices) {
        int buy_price=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buy_price){
                buy_price=prices[i];
            }
            else{
                int cur_profit=prices[i]-buy_price;
                profit=Math.max(profit,cur_profit);
            }
        }
        return profit;
    }
}
