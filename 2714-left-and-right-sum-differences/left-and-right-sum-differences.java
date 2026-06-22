class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n];
        pre[0] = nums[0];
        for(int i=1; i<n; i++){
            pre[i] = pre[i-1] + nums[i];
        }
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        leftSum[0] = 0;
        for(int i=1; i<n; i++){
            leftSum[i] = pre[i] - nums[i];
        }
        for(int i=0; i<n; i++){
            rightSum[i] = pre[n-1] - pre[i];
        }
        int[] res = new int[n];
        for(int i=0; i<n; i++){
            res[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return res;
    }
}
