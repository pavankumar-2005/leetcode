class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = 1;
        while(i <= j && j < nums.length){
            if((nums[i] % 2 == 0 && nums[j] % 2 == 0) || (nums[i] % 2 == 0 && nums[j] % 2 != 0)){
                i++;
                j++;
            }
            else if(nums[i] % 2 != 0 && nums[j] % 2 != 0){
                j++;
            }
            else if(nums[i] % 2 != 0 && nums[j] % 2 == 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return nums;
    }
}