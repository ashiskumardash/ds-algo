package array;

/*
* You are given an array prices where prices[i] is the price of a given stock on the ith day.
* You want to maximize your profit by choosing a single day to buy one stock and
* choosing a different day in the future to sell that stock.
* Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
* */
public class BestTimeToBuyAndSelleStock121 {
    public static void main(String[] args) {
        int[]prices = new int[]{7,1,5,3,6,4};
        maxProfit1(prices);
    }
    public static int maxProfit1(int[] prices) {
        int profit = 0;
        int length = prices.length;
        for (int i = 0; i < length-1; i++) {
            for (int j = i+1; j < length; j++) {
                int currentProfit = prices[j]- prices[i];
                if(currentProfit > profit){
                    profit = currentProfit;
                }
            }
        }
        return profit;
    }
    public static int maxProfit2(int[] prices) {
        int profit = 0;
        int buy = prices[0];

        int length = prices.length;
        for (int i = 1; i < length; i++) {
            if(buy>prices[i]){
                buy= prices[i];
            }
            int currentProfit = prices[i]-buy;
            if(currentProfit > profit){
                profit = currentProfit;
            }
        }
        return profit;
    }
}


