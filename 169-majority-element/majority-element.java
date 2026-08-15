class Solution {
    public int majorityElement(int[] nums) {
        int fre = 0;
        int ans = -1;
        for(int i=0; i<nums.length; i++){
            if(fre == 0 ){
                fre++;
                ans = nums[i];
            }
            else if(nums[i] == ans){
                fre++;
            }
            else{
                fre--;
            }
        }
        return ans;
    }
}