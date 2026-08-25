class Solution {
    public String rev(String r){
        StringBuilder str = new StringBuilder(r);
        return str.reverse().toString();
    }
    public String removeOccurrences(String s, String part) {
        int n = s.length();
        int m = part.length();
        Stack<Character> stk = new Stack<>();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            stk.push(ch);
            if(!stk.isEmpty() && stk.size() >= m && stk.peek() == part.charAt(m-1)){
                String k = "";
                for(int j=0; j<m; j++){
                    if(!stk.isEmpty()){
                        k += stk.pop();
                    }
                }
                String r = rev(k);
                if(!r.equals(part)){
                    for(int l=0; l<r.length(); l++){
                        stk.push(r.charAt(l));
                    }
                }
            }
        }
        String res = "";
        while(!stk.isEmpty()){
            res += stk.pop();
        }
        return rev(res);
    }
}