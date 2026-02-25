class Solution {
    public void sortColors(int[] nums) {
        int zc = 0;
        int oc = 0;
        int tc = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                zc++;
            }
            else if(nums[i] == 1){
                oc++;
            }
            else{
                tc++;
            }
        }
        int idx = 0;
        for(int i=0; i<zc; i++){
            nums[idx++] = 0;
        }
        for(int i=0; i<oc; i++){
            nums[idx++] = 1;
        }
        for(int i=0; i<tc; i++){
            nums[idx++] = 2;
        }
    }
}