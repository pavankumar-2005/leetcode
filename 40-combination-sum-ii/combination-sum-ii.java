class Solution {
    public void solve(int[] nums, int target, int idx, List<Integer> cur, List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(cur));
            return;
        }
        for(int i=idx; i<nums.length; i++){
            if(i > idx && nums[i] == nums[i-1]) continue;
            if(nums[i] > target)return;
            cur.add(nums[i]);
            solve(nums, target - nums[i], i + 1, cur, ans);
            cur.remove(cur.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        solve(candidates, target, 0, cur, ans);
        return ans;
    }
}