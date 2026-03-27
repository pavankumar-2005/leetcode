class Solution {
    public boolean canAliceWin(int[] nums) {
        int singleD = 0;
        int doubleD = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > 9){
                doubleD += nums[i];
            }
            else{
                singleD += nums[i];
            }
        }
        if(singleD != doubleD){
            return true;
        }
        return false;
    }
}