class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int k=1;
        int n = nums.length;
        boolean flag = true;
        if(nums[n-1] != n-1 || nums[n - 2] != n-1){
            return false;
        }
        for(int i=0; i<n-2; i++){
            if(nums[i] == k){
                k++;
            }
            else{
                return false;
            }
        }
        return true;
    }
}