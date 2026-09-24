class Solution {
    public void solve(int idx, int[] nums, int target,  List<List<Integer>> ans, List<Integer> cur){
        if(idx == nums.length) return;
        if(target == 0){
            ans.add(new ArrayList<>(cur));
        }
        for(int i=idx; i<nums.length; i++){
            if(nums[i] > target)continue;
            cur.add(nums[i]);
            solve(i, nums, target - nums[i], ans, cur);
            cur.remove(cur.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        solve(0, candidates, target, ans, cur);
        return ans;
    }
}