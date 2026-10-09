class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        int maxLen = 0;
        int left = 0;
        for(int i=0; i<nums.length; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
            while(mp.get(nums[i]) > k){
                mp.put(nums[left], mp.get(nums[left])-1);
                left++;
            }
            maxLen = Math.max(maxLen, i - left + 1);
        }
        return maxLen;
    }
}