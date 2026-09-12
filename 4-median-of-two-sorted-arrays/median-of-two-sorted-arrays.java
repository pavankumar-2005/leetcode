class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] ans = new int[n+m];
        int i = 0, j = 0;
        int idx = 0;
        while(i < n && j < m){
            if(nums1[i] < nums2[j]){
                ans[idx++] = nums1[i++];
            }
            else{
                ans[idx++] = nums2[j++];
            }
        }
        while(i < n){
            ans[idx++] = nums1[i++];
        }
        while(j < m){
            ans[idx++] = nums2[j++];
        }
        int len = n + m;
        if(len % 2 == 0){
            return ((ans[len/2] + ans[(len/2) - 1]) / (double)2);
        }
        return ans[(len/2)];
    }
}