class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int max = Integer.MIN_VALUE;
        int i = 0, j = n - 1;
        while(i < j){
            int w = j - i;
            int ht = Math.min(height[i], height[j]);
            int curWater = w * ht;
            max = Math.max(curWater, max);
            if(height[i] < height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return max;
    }
}