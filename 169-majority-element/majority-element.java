class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<n; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0)+1);
        }

        int majorityEle = -1;
        for(int i=0; i<n; i++){
            if(mp.get(nums[i]) > n/2){
                majorityEle = nums[i];
                break;
            }
        }
        return majorityEle;
    }
}