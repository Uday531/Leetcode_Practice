package day7;

public class BestTimeToBuyAndSellStocks {
    static void main() {
        int[] a = {7, 1, 5, 3, 6, 4};
        System.out.println(bestTime(a));
    }
    public static int bestTime(int[] a){
        int buy_price=a[0];
        int profit=0;
        for(int i=1;i<a.length;i++){
            if(a[i]<buy_price){
                buy_price=a[i];
            }else{
                int current_profit=a[i]-buy_price;
                profit=Math.max(current_profit,profit);
            }
        }
        return profit;
    }
}
