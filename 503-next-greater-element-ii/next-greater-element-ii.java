class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> stk = new Stack<>();
        for(int i=(n * 2) - 1; i>=0; i--){
            while(!stk.isEmpty() && stk.peek() <= nums[i % n]){
                stk.pop();
            }
            if(i < n){
                if(stk.isEmpty())res[i] = -1;
                else res[i] = stk.peek();
            }
            stk.push(nums[i % n]);
        }
        return res;
    }
}