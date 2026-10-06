class Solution {
    public int minAddToMakeValid(String s) {
        int count = 0;
        Stack<Character> stk = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                stk.push(ch);
            }
            else if(ch == ')'){
                if(stk.isEmpty() || stk.peek() == ')')stk.push(')');
                else if(stk.peek() == '(') stk.pop();
            }
        }
        return stk.size();
    }
}