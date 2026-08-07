class Solution {
    public int maxProfit(int[] prices) {
        int bp = prices[0];
        int maxPro = 0;
        for(int i=0; i<prices.length; i++){
            if(prices[i] > bp){
                int curPro = prices[i] - bp;
                maxPro = Math.max(maxPro, curPro);
            }
            else{
                bp = prices[i];
            }
        }
        return maxPro;
    }
}