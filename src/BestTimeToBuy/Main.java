package BestTimeToBuy;

public class Main {
    public static void main(String[] args) {
        int [] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }

    static int maxProfit(int[] prices) {
        int buyTime = prices[0];
        int profit =0;

        for (int i=0; i< prices.length; i++){
            if (prices[i] < buyTime){
                buyTime = prices[i];
            }else {
                int currentProfit = prices[i] - buyTime;
                profit = Math.max(profit , currentProfit);
            }
        }
        return profit;

    }
}
