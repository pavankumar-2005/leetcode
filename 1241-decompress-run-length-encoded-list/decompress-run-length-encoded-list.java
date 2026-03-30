class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> lst = new ArrayList<>();
        for(int i=0; i<nums.length - 1; i++){
            int f = nums[i];
            int s = nums[i+1];
            while(f-->0){
                lst.add(s);
            }
            i++;
        }
        int[] a = new int[lst.size()];
        int idx = 0;
    for(int i=0; i<lst.size(); i++){
        a[i] = lst.get(i);
    }
    return a;
    }
}