class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum = 0, sum = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<k; i++){
            sum += nums[i];
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }
        if(mp.size() == k) maxSum = Math.max(maxSum, sum);
        int left = 0;
        for(int i=k; i<nums.length; i++){
            sum += nums[i];
            sum -= nums[left];
            mp.put(nums[left], mp.get(nums[left]) - 1);
            if(mp.get(nums[left]) == 0)mp.remove(nums[left]);
            left++;
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
            if(mp.size() == k) maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}