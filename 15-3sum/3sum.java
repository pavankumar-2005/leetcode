class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lst = new ArrayList<>();
        Set<ArrayList<Integer>> ans = new HashSet<>();
        Set<Integer> st = new HashSet<>();
        ArrayList<Integer> inner = new ArrayList<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            st = new HashSet<>();
            for(int j=i+1; j<n; j++){
                int third = -(nums[i] + nums[j]);
                if(st.contains(third)){
                    inner.add(nums[i]);
                    inner.add(third);
                    inner.add(nums[j]);
                    Collections.sort(inner);
                    ans.add(inner);
                    inner = new ArrayList<>();
                }
                st.add(nums[j]);
            }
        }
        for(ArrayList<Integer> num : ans){
            lst.add(num);
        }
        return lst;
    }
}