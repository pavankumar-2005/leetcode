class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int maxP = 0;
        for(int i=0; i<prices.length; i++){
            if(prices[i] < buyPrice){
                buyPrice = prices[i];
            }
            else{
                int profit = prices[i] - buyPrice;
                maxP = Math.max(maxP, profit);
            }
        }
        return maxP;
    }
}