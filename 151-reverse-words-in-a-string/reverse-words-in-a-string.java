class Solution {
    public String reverseWords(String s) {
        String res = "";
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1; i>=0; i--){
            char ch = s.charAt(i);
            if(ch != ' '){
                sb.append(ch);
            }
            else{
                if(!sb.isEmpty()){
                res += sb.reverse().toString();
                res += " ";
                sb.setLength(0);
                }
            }
        }
        if(!sb.isEmpty()){
            res += sb.reverse().toString();
        }
        return res.trim();
    }
}