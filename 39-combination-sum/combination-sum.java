class Solution {
    public void backtrack(int idx, int[] nums, int target, List<Integer> cur, List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(cur));
        }
        for(int i=idx; i<nums.length; i++){
            if(nums[i] > target)return;
            cur.add(nums[i]);
            backtrack(i, nums, target - nums[i], cur, ans);
            cur.remove(cur.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(0, candidates, target, cur, ans);
        return ans;
    }
}