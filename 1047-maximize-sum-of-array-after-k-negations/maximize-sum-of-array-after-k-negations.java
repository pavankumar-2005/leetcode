class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(nums[i] < 0 && k > 0){
                nums[i] = -nums[i];
                k--;
            }
        }
        Arrays.sort(nums);
        int sum = 0;
        if( k % 2 != 0)nums[0] = -nums[0];
        for(int i : nums)sum += i;
        return sum;
    }
}