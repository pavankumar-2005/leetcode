class Solution {
    public boolean divideArray(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(st.contains(nums[i]))st.remove(nums[i]);
            else st.add(nums[i]);
        }
        return st.isEmpty();
    }
}