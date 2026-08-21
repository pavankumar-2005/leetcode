class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int leftMax = 0, rightMax = 0;
        int ans = 0;
        int i = 0, j = n - 1;
        while(i < j){
            if(height[i] < height[j]){
                if(leftMax > height[i]){
                    ans += (leftMax - height[i]);
                    i++;
                }
                else{
                    leftMax = height[i];
                    i++;
                }
            }
            else{
                if(rightMax > height[j]){
                    ans += (rightMax - height[j]);
                    j--;
                }
                else{
                    rightMax = height[j];
                    j--;
                }
            }
        }
        return ans;
    }
}