class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum = numBottles;
        while(numBottles >= numExchange){
            sum += (numBottles/numExchange);
            int mod = numBottles % numExchange;
            numBottles /= numExchange;
            numBottles += mod;
        }
        return sum;
    }
}