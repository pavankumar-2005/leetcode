class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int ans1 = 0, ans2 = 0;
        Set<Integer> st1 = new HashSet<>();
        Set<Integer> st2 = new HashSet<>();
        for(int i=0; i<nums2.length; i++){
            st2.add(nums2[i]);
        }
        for(int i=0; i<nums1.length; i++){
            if(st2.contains(nums1[i])){
                ans1++;
            }
            st1.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++){
            if(st1.contains(nums2[i])){
                ans2++;
            }
        }
        return new int[] {ans1, ans2};
    }
}