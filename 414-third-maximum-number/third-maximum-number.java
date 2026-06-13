class Solution {
    public int thirdMax(int[] nums) {
        List<Integer> lst = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(!lst.contains(nums[i])){
                lst.add(nums[i]);
            }
        }
        int[] a = new int[lst.size()];
        for(int i=0; i<a.length; i++){
            a[i] = lst.get(i);
        }
        Arrays.sort(a);
        if(a.length < 3) return a[a.length - 1];
        return a[a.length - 3];
    }
}