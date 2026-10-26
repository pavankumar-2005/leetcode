class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> stk = new Stack<>();
        Stack<Integer> st = new Stack<>();
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
            while(!st.isEmpty() && heights[st.peek()] >= heights[i])st.pop();
            if(st.isEmpty())nse[i] = n;
            else nse[i] = st.peek();
            st.push(i);
        }
        for(int i=0; i<n; i++){
            System.out.print(pse[i] + " ");
        }
        System.out.println();
        for(int i=0; i<n; i++){
            System.out.print(nse[i] + " ");
        }
        int max = 0;
        for(int i=0; i<n; i++){
            int cur = ((nse[i] - pse[i]) - 1) * heights[i];
            max = Math.max(max, cur);
        }
        return max;
    }
}