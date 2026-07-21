class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(!stk.isEmpty() && stk.peek() == s.charAt(i)){
                stk.pop();
            }
            else{
                stk.push(s.charAt(i));
            }
        }
        String k = "";
        String l = "";
        while(!stk.isEmpty()){
            k += stk.pop();
        }
        for(int i=k.length()-1; i>=0; i--){
            l += k.charAt(i);
        }
        return l;
    }
}