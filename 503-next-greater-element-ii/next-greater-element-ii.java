class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] cpy = new int[nums.length * 2];
        int idx = 0;
        for(int i=0; i<nums.length; i++){
            cpy[idx++] = nums[i];
        }
        for(int i=0; i<nums.length; i++){
            cpy[idx++] = nums[i];
        }
        int[] res = new int[nums.length];
        Stack<Integer> stk = new Stack<>();
        for(int i=cpy.length - 1; i>=0; i--){
            while(!stk.isEmpty() && stk.peek() <= cpy[i]){
                stk.pop();
            }
            if(i < nums.length){
                if(stk.isEmpty())res[i] = -1;
                else res[i] = stk.peek();
            }
            stk.push(cpy[i]);
        }
        return res;
    }
}