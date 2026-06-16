class Solution {
    public static String rev(String k){
        String l = "";
        for(int i=k.length()-1; i>=0; i--){
            l += k.charAt(i);
        }
        return l;
    }
    public String processStr(String s) {
        String k = "";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '*'){
                if(k.length() >= 1){
                k = k.substring(0, k.length()-1);
                }
            }
            else if(ch == '#'){
                k += k;
            }
            else if(ch == '%'){
                k = rev(k);
            }
            else{
                k += s.charAt(i);
            }
        }
        return k;
    }
}