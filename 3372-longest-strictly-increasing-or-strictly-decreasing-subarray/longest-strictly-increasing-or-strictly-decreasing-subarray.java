class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc = 1, dec = 1;
        int max = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] > nums[i-1]){
                dec = 1;
                inc++;
                max = Math.max(max, inc);
            }
            else if(nums[i] < nums[i-1]){
                inc = 1;
                dec++;
                max = Math.max(max, dec);
            }
            else{
                inc = 1;
                dec = 1;
            }
        }
        max = Math.max(max, Math.max(inc , dec));
        return max;
    }
}