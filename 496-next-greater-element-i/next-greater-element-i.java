class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stk = new Stack<>();
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<nums2.length; i++){
            mp.put(nums2[i], i);
        }
        int[] index = new int[nums2.length];
        for(int i=nums2.length - 1; i>=0; i--){
            while(!stk.isEmpty() && stk.peek() <= nums2[i])stk.pop();
            if(stk.isEmpty())index[i] = -1;
            else index[i] = stk.peek();
            stk.push(nums2[i]);
        }
        int[] res = new int[nums1.length];
        int idx = 0;
        for(int i=0; i<nums1.length; i++){
            int loc = mp.get(nums1[i]);
            res[idx++] = index[loc];
        }
        return res;
    }
}