class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] used;
        Arrays.sort(nums);
        used = new boolean[nums.length];
        backtrack(nums, temp, ans, used);
        return ans;
    }
    private void backtrack(int[] nums,List<Integer> temp, List<List<Integer>> ans, boolean[] used) {
        if(temp.size() == nums.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;
            if(used[i]) continue;
            used[i] = true;
            temp.add(nums[i]);
            backtrack(nums, temp, ans, used); //recursion
            temp.remove(temp.size() - 1); //undo
            used[i] = false; //undo
        }
    }
}