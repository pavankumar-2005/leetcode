class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            for(int j=i+1; j<n; j++){
                if(j > i+1 && nums[j] == nums[j-1]) continue;
                int k = j + 1;
                int l = n - 1;
                while(k < l && l > 0){
                    long sum1 = nums[i] + nums[j];
                    long sum2 = sum1 + nums[k];
                    long sum3 = sum2 + nums[l];
                    if(sum3 < target){
                        k++;
                    }
                    else if(sum3 > target){
                        l--;
                    }
                    else{
                        cur.add(nums[i]);
                        cur.add(nums[j]);
                        cur.add(nums[k]);
                        cur.add(nums[l]);
                        k++;
                        l--;
                        ans.add(new ArrayList<>(cur));
                        cur = new ArrayList<>();
                        while(k < l && nums[k] == nums[k-1]) k++;
                        while(l > k && nums[l] == nums[l+1]) l--;
                    }
                }
            }
        }
        return ans;
    }
}