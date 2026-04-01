// class Solution {
//     public int[] rearrangeArray(int[] nums) {
//        int[] p = new int[nums.length / 2];
//        int idx1 = 0;
//        int idx2 = 0;
//        int[] n = new int[nums.length / 2];
//        for(int i=0; i<nums.length; i++){
//         if(nums[i] > 0){
//             p[idx1++] = nums[i];
//         }
//         else{
//             n[idx2++] = nums[i];
//         }
//        }
//        int i1 = 0;
//        int i2 = 1;
//        for(int i=0; i<nums.length; i++){
//         nums[i] = p[i1++];
//         i++;
//        }
//        for(int i=1; i<nums.length; i++){
//         nums[i] = n[i2++];
//         i++;
//        }
//        return nums;
//     }
// }
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int p = 0, q = 1; // p for positive index, q for negative index

        for (int x : nums) {
            if (x > 0) {
                res[p] = x;
                p += 2;
            } else {
                res[q] = x;
                q += 2;
            }
        }
        return res;
    }
}