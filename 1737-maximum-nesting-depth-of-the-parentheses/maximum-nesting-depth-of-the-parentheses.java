class Solution {
    public int maxDepth(String s) {
        int maxDepth = 0;
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(ch);
                maxDepth = Math.max(maxDepth, st.size());
            }
            else if(ch == ')' && !st.isEmpty()){
                st.pop();
            }
        }
        return maxDepth;
    }
}