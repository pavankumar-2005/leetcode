class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxArea = Integer.MIN_VALUE;
        int[] nsr = new int[n];
        int[] nsl = new int[n];
        Stack<Integer> stk = new Stack<>();
        for(int i=n-1; i>=0; i--){
            while(!stk.isEmpty() && heights[stk.peek()] >= heights[i]) stk.pop();
            if(stk.isEmpty()){
                nsr[i] = n;
            }
            else{
                nsr[i] = stk.peek();
            }
            stk.push(i);
        }
        stk = new Stack<>();
        for(int i=0; i<n; i++){
            while(!stk.isEmpty() && heights[stk.peek()] >= heights[i]) stk.pop();
            if(stk.isEmpty()){
                nsl[i] = -1;
            }
            else{
                nsl[i] = stk.peek();
            }
            stk.push(i);
        }
        for(int i=0; i<n; i++){
            int currArea = heights[i] * (nsr[i] - nsl[i] - 1);
            maxArea = Math.max(maxArea, currArea);
        }
        return maxArea;
    }
}