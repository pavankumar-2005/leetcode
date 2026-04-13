class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int maxOr = 0;
        for (int x : nums) maxOr |= x;
        int n = nums.length, ans = 0;
        int total = 1 << n;
        for (int mask = 0; mask < total; mask++) {
            int cur = 0;
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) cur |= nums[i];
            }
            if (cur == maxOr) ans++;
        }
        return ans;
    }
}