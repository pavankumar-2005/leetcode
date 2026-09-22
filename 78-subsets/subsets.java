class Solution {
    public void backtrack(int idx, int[] nums, List<List<Integer>> ans, List<Integer> cur){
        ans.add(new ArrayList<>(cur));
        for(int i=idx; i<nums.length; i++){
            cur.add(nums[i]);
            backtrack(i+1, nums, ans, cur);
            cur.remove(cur.size() - 1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        backtrack(0, nums, ans, cur);
        return ans;
    }
}