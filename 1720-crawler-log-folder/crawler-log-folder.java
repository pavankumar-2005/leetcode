class Solution {
    public int minOperations(String[] logs) {
        Stack<String> stk = new Stack<>();
        for(int i=0; i<logs.length; i++){
            String s = logs[i];
            if(s.equals("../")){
                if(!stk.isEmpty())stk.pop();
            }
            else if(s.equals("./")){
                continue;
            }
            else{
                stk.push(s);
            }
        }
        return stk.size();
    }
}