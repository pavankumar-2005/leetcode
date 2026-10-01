class Solution {
    public void backtrack(int idx, int[] nums, List<Integer> cur, List<List<Integer>> ans){
        ans.add(new ArrayList<>(cur));
        for(int i=idx; i<nums.length; i++){
            if(i != idx && nums[i] == nums[i-1])continue;
            cur.add(nums[i]);
            backtrack(i+1, nums, cur, ans);
            cur.remove(cur.size() - 1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        backtrack(0, nums, cur, ans);
        return ans;
    }
}