class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] a = new int[nums.length];
        int idx = 0;
        for(int i=0; i<nums.length; i++){
            int curr = nums[i];
            int count = 0;
            for(int j=0; j<nums.length; j++){
                if(nums[j] < curr){
                    count++;
                }
            }
            a[idx++] = count;
        }
        return a;
    }
}