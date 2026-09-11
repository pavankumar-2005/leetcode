class Solution {
    public boolean isPossible(int[] nums, int maxSum, int k){
        int sum = 0, count = 1;
        for(int i=0; i<nums.length; i++){
            if(sum + nums[i] <= maxSum){
                sum += nums[i];
            }
            else{
                count++;
                sum = nums[i];
            }
            if(count > k) return false;
        }
        return count <= k;
    }
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        if(k > n)return -1;
        int low = nums[0]; 
        int high = 0;
        for(int i=0; i<n; i++){
            low = Math.max(low, nums[i]);
            high += nums[i];
        }
        while(low <= high){
            int mid = (low + high) / 2;
            if(isPossible(nums, mid, k)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}