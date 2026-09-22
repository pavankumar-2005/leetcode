class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int j = i+1;
            int k = n - 1;
            while(j < k && k < n){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum < 0){
                    j++;
                }
                else if(sum > 0){
                    k--;
                }
                else{
                    cur.add(nums[i]);
                    cur.add(nums[j]);
                    cur.add(nums[k]);
                    j++;
                    k--;
                    ans.add(new ArrayList<>(cur));
                    cur = new ArrayList<>();
                    while(j < k && nums[j] == nums[j-1]) j++;
                    while(k > j && nums[k] == nums[k+1]) k--;
                }
            }
        }
        return ans;
    }
}