class Solution {
    public boolean isPossible(int[] weights, int maxWt, int days){
        int shipWt = 0, count = 1;
        for(int i=0; i<weights.length; i++){
            if(shipWt + weights[i] <= maxWt){
                shipWt += weights[i];
            }
            else{
                count++;
                shipWt = weights[i];
            }
            if(count > days) return false;
        }
        return count <= days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int low = 0, high = 0;
        for(int i=0; i<n; i++){
            low = Math.max(low, weights[i]);
            high += weights[i];
        }
        while(low <= high){
            int mid = (low  + high) / 2;
            if(isPossible(weights, mid, days)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}