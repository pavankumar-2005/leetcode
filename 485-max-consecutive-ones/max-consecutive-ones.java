class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int mc = 0;
        int cc = 0;
        for(int i=0; i<nums.length; i++){             
            if(nums[i] == 1){
                cc++;
            }else{
                mc = Math.max(cc, mc);
                cc = 0;
            }
        }
        return Math.max(cc, mc);
    }
}