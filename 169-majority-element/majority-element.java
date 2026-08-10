class Solution {
    public int majorityElement(int[] nums) {
        int fre = 0, ans = 0;
        for(int i=0; i<nums.length; i++){
            if(fre == 0){
                ans = nums[i];
            }
            if(ans == nums[i]){
                fre++;
            }
            else{
                fre--;
            }
        }
        return ans;
    }
}