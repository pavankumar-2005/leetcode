class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int k = nums[0];
        ArrayList<Integer> lst = new ArrayList<>();
        int i = 0;
        while(i < nums.length){
            if(nums[i] == k){
                i++;
                k++;
            }
            else{
                lst.add(k);
                k++;
            }
        }
        return lst;
    }
}