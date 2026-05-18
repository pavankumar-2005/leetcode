class MinStack {
    Stack<Integer> stk;
    Stack<Integer> mstk;
    public MinStack() {
        stk = new Stack<>();
        mstk = new Stack<>();
    }
    
    public void push(int val) {
        if(mstk.isEmpty() || val <= mstk.peek()) mstk.push(val);
        stk.push(val);
    }
    
    public void pop() {
       if(!mstk.isEmpty() && stk.peek().equals(mstk.peek())) mstk.pop();
       stk.pop(); 
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return mstk.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */