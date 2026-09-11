class Solution {
    public int firstOcc(int[] nums, int target){
        int ans = -1;
        int low = 0, high = nums.length - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] == target){
                ans = mid;
                high = mid - 1;
            }
            else if(nums[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return ans;
    }
    public int lastOcc(int[] nums, int target){
        int ans = -1;
        int low = 0, high = nums.length - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] == target){
                ans = mid;
                low = mid + 1;
            }
            else if(nums[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = firstOcc(nums, target);
        res[1] = lastOcc(nums, target);
        return res;
    }
}