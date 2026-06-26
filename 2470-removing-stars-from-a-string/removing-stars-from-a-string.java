class Solution {
    public String removeStars(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch != '*'){
                stk.push(ch);
            }
            else{
                if(!stk.isEmpty()){
                    stk.pop();
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stk.isEmpty()){
            sb.append(stk.pop());
        }
        return sb.reverse().toString();
    }
}