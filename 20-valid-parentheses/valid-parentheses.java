class Solution {
    public boolean isValid(String s) {
        boolean valid = true;
        Stack<Character> stk = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stk.push(s.charAt(i));
            }
            else if(!stk.isEmpty()){            
               if(s.charAt(i) == ')'){
                if(stk.pop() != '('){
                     return false;
                }
            }
            else if(s.charAt(i) == '}'){
                if(stk.pop() != '{'){
                    return false;
                }
            }
            else if(s.charAt(i) == ']'){
                if(stk.pop() != '['){
                    return false;
                }
            }
            }
            else{
                return false;
            }
        }
            if(!stk.isEmpty()){
                valid = false;;
            }
            return valid;
    }
}