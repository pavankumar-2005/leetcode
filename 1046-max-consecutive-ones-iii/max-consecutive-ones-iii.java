class Solution {
    public int longestOnes(int[] nums, int k) {
        int zcount = 0;
        int ws = 0, we = 0, mx = 0, n = nums.length;
        for(we = 0; we < n; we++) {
            int val = nums[we];
            if(val == 0) {
                zcount++;
            }
            while(zcount > k) {
                int rem = nums[ws];
                ws++;
                if(rem == 0) {
                    zcount--;
                    break;
                }
            }
            mx = Math.max(mx, we - ws + 1);
        }
        return mx;
    }
}