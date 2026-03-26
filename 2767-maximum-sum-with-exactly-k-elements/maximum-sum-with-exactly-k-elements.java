class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int max = nums[nums.length - 1];
        int sum = 0;
        while(k-->0){
            sum += max;
            max += 1;
        }
        return sum;
    }
}