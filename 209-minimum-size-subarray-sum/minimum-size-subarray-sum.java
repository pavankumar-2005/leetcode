class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int sum = 0, left = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            while(sum >= target){
             if(sum >= target) minLen = Math.min(minLen, i - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}