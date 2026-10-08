class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int minDif = Integer.MAX_VALUE;
        for(int i=k-1; i<nums.length; i++){
            minDif = Math.min(minDif, nums[i] - nums[left]);
            left++;
        }
        return minDif;
    }
}