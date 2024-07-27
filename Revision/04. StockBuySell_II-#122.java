class Solution {
    public int maxProfit(int[] prices) {
        int bought = prices[0];
        int profit = 0;
        for(int i = 1;i<prices.length; i++){
            if(prices[i] > bought) profit += prices[i] - bought; //if there is a profit, then sell it and add it to the total profit
            bought = prices[i]; //now we will buy again on the next day
        }
        return profit;
    }
}
