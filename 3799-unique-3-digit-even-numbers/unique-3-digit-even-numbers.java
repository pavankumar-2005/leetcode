class Solution {
    public int totalNumbers(int[] nums) {
        int n = nums.length;
        Set<Integer> st = new HashSet<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                for(int k=0; k<n; k++){
                    if(i != j && i != k && (nums[i] != 0) && j != k && (nums[k] % 2 == 0)){
                        int num = nums[k] + (nums[j] * 10) + (nums[i] * 100);
                        st.add(num);
                    }
                }
            }
        }
        return st.size();
    }
}