class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        String ans = "";
        for(int i=0; i<str.length; i++){
            String k = str[i];
            for(int j=k.length() - 1; j>=0; j--){
                ans += k.charAt(j);
            }
            ans += " ";
        }
        if(ans.charAt(ans.length() - 1) == ' '){
            ans = ans.substring(0, ans.length() - 1);
        }
        return ans;
    }
}