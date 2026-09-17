class Solution {
    public void backTrack(int[] candidates, int target, int idx, List<Integer> curr, List<List<Integer>> res){
        if(target == 0){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=idx; i<candidates.length; i++){
            if(candidates[i] > target)break;
            curr.add(candidates[i]);
            backTrack(candidates, target - candidates[i], i, curr, res);
            curr.remove(curr.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(candidates);
        backTrack(candidates, target, 0, curr, res);
        return res;
    }
}