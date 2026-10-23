class Solution {
    public boolean isValid(int[] piles, int h, int mid){
        int count = 0;
        for(int i=0; i<piles.length; i++){
            if(piles[i] <= mid){
                count++;
            }
            else{
                count += Math.ceil(piles[i]/(double)mid);
            }
            if(count > h) return false;
        }
        return count <= h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = piles[0];
        for(int i=0; i<piles.length; i++){
            high = Math.max(piles[i], high); 
        }
        while(low <= high){
            int mid = (low + high) / 2;
            if(isValid(piles, h, mid)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}