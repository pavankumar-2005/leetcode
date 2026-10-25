class StockSpanner {
    private Stack<int[]> stk;
    static int idx = -1;
    public StockSpanner() {
        stk = new Stack<>();
        idx = -1;
    }

    public int next(int price) {
        idx = idx + 1;
        while(!stk.isEmpty() && stk.peek()[0] <= price){
            stk.pop();
        }
        if(stk.isEmpty()){
            stk.push(new int[] {price, idx});
            return idx - (-1);
        }
        int ans = idx - stk.peek()[1];
        stk.push(new int[] {price, idx});
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */