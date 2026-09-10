class Solution {
    public boolean canDistribute(int[] quantities, int maxCap, int n){
        int maxStores = 0;
        for(int i=0; i<quantities.length; i++){
            maxStores += Math.ceil(quantities[i] /(double)maxCap);
            if(maxStores > n){
                return false;
            }
        }
        return maxStores <= n;
    }
    public int minimizedMaximum(int n, int[] quantities) {
        int low = 1, high = quantities[0];
        for(int i=0; i<quantities.length; i++){
            high = Math.max(high, quantities[i]);
        }
        while(low <= high){
            int mid = (low + high) / 2;
            if(canDistribute(quantities, mid, n)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}