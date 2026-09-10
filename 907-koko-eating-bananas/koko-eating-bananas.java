class Solution {
    public boolean canEat(int[] piles, int maxCap, int h){
        int hours = 0;
        for(int i=0; i<piles.length; i++){
            if(piles[i] <= maxCap){
                hours++;
            }
            else{
                hours += Math.ceil(piles[i] /(double)(maxCap));
            }
            // if(hours > h){
            //     return false;
            // }
        }
        return hours <= h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = piles[0];
        for(int i=0; i<piles.length; i++){
            high = Math.max(piles[i], high);
        }
        while(low <= high){
            int mid = (low + high) / 2;
            if(canEat(piles, mid, h)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}