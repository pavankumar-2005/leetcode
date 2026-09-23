class Solution {
    public void backtrack(int idx, int[] nums, int k, List<List<Integer>> ans, List<Integer> cur){
        if(cur.size() == k){
            ans.add(new ArrayList<>(cur));
            return;
        }
        for(int i=idx; i<nums.length; i++){
            cur.add(nums[i]);
            backtrack(i+1, nums, k, ans, cur);
            cur.remove(cur.size() - 1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        int[] nums = new int[n+1];
        for(int i=1; i<=n; i++){
            nums[i] = i;
        }
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        backtrack(1, nums, k, ans, cur);
        return ans;
    }
}