class Solution {
    public void backtrack(int[] nums, int idx, List<List<Integer>> ans, List<Integer> cur){
        ans.add(new ArrayList<>(cur));
        if(idx == nums.length) return;
        for(int i=idx; i<nums.length; i++){
            if(i != idx && nums[i] == nums[i-1]) continue;
            cur.add(nums[i]);
            backtrack(nums, i+1, ans, cur);
            cur.remove(cur.size() - 1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, 0, ans, cur);
        return ans;
    }
}