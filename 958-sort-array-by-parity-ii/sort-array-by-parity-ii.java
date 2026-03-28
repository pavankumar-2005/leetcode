class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = (nums.length / 2);
        int[] even = new int[n];
        int[] odd = new int[n];
        int[] parity = new int[nums.length];
        int ei = 0;
        int oi = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] % 2 == 0){
                even[ei++] = nums[i];
            }
            else{
                odd[oi++] = nums[i];
            }
        }
        int e = even.length;
        int o = odd.length;
        int idx_e = 0;
        int idx_o = 1;
        int i1 = 0;
        int i2 = 0;
        while(e-->0){
            parity[idx_e] = even[i1++];
            idx_e += 2;
        }
        while(o-->0){
            parity[idx_o] = odd[i2++];
            idx_o += 2;
        }
        return parity;
    }
}