class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] rightMax = new int[n];
        int leftMax = 0;
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }
        int ans = 0;
        for(int i=0; i<n; i++){
            leftMax = Math.max(leftMax, height[i]);
            ans += Math.min(leftMax, rightMax[i]) - height[i];
        }
        return ans;
    }
}