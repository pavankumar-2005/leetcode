class MyQueue {
    private Stack<Integer> stk;
    private Stack<Integer> stk2;
    public MyQueue() {
        stk = new Stack<>();
        stk2 = new Stack<>();
    }
    
    public void push(int x) {
        stk.push(x);
    }
    
    public int pop() {
        if(stk.isEmpty())return -1;
        while(!stk.isEmpty()){
            stk2.push(stk.pop());
        }
        int top = stk2.peek();
        stk2.pop();
        while(!stk2.isEmpty()){
            stk.push(stk2.pop());
        }
        return top;
    }
    
    public int peek() {
        if(stk.isEmpty()) return -1;
        while(!stk.isEmpty()){
            stk2.push(stk.pop());
        }
        int top = stk2.peek();
        while(!stk2.isEmpty()){
            stk.push(stk2.pop());
        }
        return top;
    }
    
    public boolean empty() {
        return stk.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */