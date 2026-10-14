class MyStack {
    private Queue<Integer> q1;
    private Queue<Integer> q2;
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        q1.offer(x);
    }
    
    public int pop() {
        if(q1.isEmpty()) return -1;
        int top = -1;
        while(!q1.isEmpty()){
            if(q1.size() == 1){
                top = q1.poll();
                break;
            }
            q2.offer(q1.poll());
        }
        while(!q2.isEmpty())q1.offer(q2.poll());
        return top;
    }
    
    public int top() {
        if(q1.isEmpty()) return -1;
        int top = -1;
        while(!q1.isEmpty()){
            if(q1.size() == 1){
                top = q1.peek();
            }
            q2.offer(q1.poll());
        }
        while(!q2.isEmpty())q1.offer(q2.poll());
        return top;
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */