class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int minL = Integer.MAX_VALUE;
        int curSum = 0;
        for(int i=0; i<nums.length; i++){
            curSum += nums[i];
            while(curSum >= target){
                minL = Math.min(minL, i - left + 1);
                curSum -= nums[left];
                left++;
            }
        }
        return minL == Integer.MAX_VALUE ? 0 : minL;
    }
}