class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> stk = new Stack<>();
        int[] pse = new int[n];
        int[] nse = new int[n];
        for(int i=0; i<n; i++){
            while(!stk.isEmpty() && heights[stk.peek()] >= heights[i])stk.pop();
            if(stk.isEmpty())pse[i] = -1;
            else pse[i] = stk.peek();
            stk.push(i);
        }
        stk.clear();
        for(int i=n-1; i>=0; i--){
            while(!stk.isEmpty() && heights[stk.peek()] >= heights[i])stk.pop();
            if(stk.isEmpty())nse[i] = n;
            else nse[i] = stk.peek();
            stk.push(i);
        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int cur = ((nse[i] - pse[i]) - 1) * heights[i];
            max = Math.max(max, cur);
        }
        return max;
    }
}