class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int l = 1, h = n * n;
        int ans = 0;
        while(l <= h){
            int mid = (l + h) / 2;
            if(mid * w <= maxWeight){
                ans = mid;
                l = mid + 1;
            }
            else{
                h = mid - 1;
            }
        }
        return ans;
    }
}