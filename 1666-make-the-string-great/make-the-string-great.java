class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stk = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!stk.isEmpty() && ((Character.toLowerCase(ch) == Character.toLowerCase(stk.peek()) && Character.isUpperCase(ch) && Character.isLowerCase(stk.peek())) || ((Character.toLowerCase(ch) == Character.toLowerCase(stk.peek()) && Character.isLowerCase(ch) && Character.isUpperCase(stk.peek()))))){
                stk.pop();
                continue;
            }
            stk.push(ch);
        }
        while(!stk.isEmpty())sb.append(stk.pop());
        return sb.reverse().toString();
    }
}