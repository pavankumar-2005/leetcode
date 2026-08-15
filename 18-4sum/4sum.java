class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> inner = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i + 1; j < n; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;
                int k = j + 1, l = n - 1;
                while (k < l) {
                    long sum = nums[i] + nums[j];
                    sum += nums[k] + nums[l];
                    if (sum > target) {
                        l--;
                    } else if (sum < target) {
                        k++;
                    } else {
                        inner.add(nums[i]);
                        inner.add(nums[j]);
                        inner.add(nums[k]);
                        inner.add(nums[l]);
                        ans.add(inner);
                        inner = new ArrayList<>();
                        k++;
                        l--;
                        while (k < l && nums[k] == nums[k - 1])
                            k++;
                        while (l > k && nums[l] == nums[l + 1])
                            l--;
                    }
                }
            }
        }
        return ans;
    }
}