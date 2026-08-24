class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        StringBuilder str = new StringBuilder();
        String res = "";
        for(int i=n-1; i>=0; i--){
            if(s.charAt(i) != ' '){
                str.append(s.charAt(i));
            }
            else{
                if(str.length() > 0){
                    res += str.reverse().toString();
                    res += " ";
                    str.setLength(0);
                }
            }
        }
        if(str.length() > 0){
            res += str.reverse().toString();
        }
        return res.trim();
    }
}