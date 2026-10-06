class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int maxLen = 0;
        int kcount = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0)kcount++;
            while(kcount > k){
                if(nums[left] == 0)kcount--;
                left++;
            }
            maxLen = Math.max(maxLen, i - left + 1);
        }
        return maxLen;
    }
}