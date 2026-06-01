class Solution {
    public int minimumCost(int[] cost) {
        // if(cost.length == 1) return cost[0];
        Arrays.sort(cost);
        int minCost = 0;
        for(int i=cost.length - 1; i>=0; i-=3){
            if(i==0){
                minCost += cost[0];
            }
            else{
               minCost += cost[i] + cost[i - 1];
            }
        }
        return minCost;
    }
}