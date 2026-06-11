class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int i1 = 0;
        int i2 = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> lst = new ArrayList<>();
        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    lst.add(nums1[i]);
                    nums2[j] = -1;
                    break;
                }
            }
        }
        int[] a = new int[lst.size()];
        for(int i=0; i<a.length; i++){
            a[i] = lst.get(i);
        }
        return a;
    }
}