class MinStack {
    private Stack<Integer> stk;
    private Stack<Integer> mstk;
    public MinStack() {
        stk = new Stack<>();
        mstk = new Stack<>();
    }
    
    public void push(int value) {
        if(mstk.isEmpty() || mstk.peek() >= value) mstk.push(value);
        stk.push(value);
    }
    
    public void pop() {
        if(!mstk.isEmpty() && stk.peek().equals(mstk.peek()))mstk.pop();
        if(stk.isEmpty()) return;
        stk.pop();
    }
    
    public int top() {
        if(stk.isEmpty()) return 0;
        return stk.peek();
    }
    
    public int getMin() {
        if(mstk.isEmpty()) return 0;
        return mstk.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */