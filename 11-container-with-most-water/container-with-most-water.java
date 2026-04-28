class Solution {
    public int maxArea(int[] height) {
       int l = 0;
       int r = height.length - 1;
       int res = 0;
       while(l < r){
        int h = Math.min(height[l],height[r]);
        int w = r - l;
        int vol = h * w;
        res = Math.max(res, vol);
        if(height[l] < height[r]){
            l++;
        }
        else{
            r--;
        }       
       } 
       return res;
    }
}