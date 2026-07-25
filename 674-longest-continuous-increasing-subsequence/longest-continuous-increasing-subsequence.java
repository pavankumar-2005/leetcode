class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int c = 0;
        int maxC = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i] > nums[i-1]){
                c++;
            }
            else{
                maxC = Math.max(c+1, maxC);
                c = 0;
            }
        }
        return Math.max(c+1, maxC);
    }
}