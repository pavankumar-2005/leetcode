class Solution {
    public String reverseOnlyLetters(String s) {
        String k = "";
       for(int i=s.length()-1; i>=0; i--){
        char ch = s.charAt(i);
        if(Character.isLetter(ch)){
            k += s.charAt(i);
        }
       }
       int idx = 0;
       String res = "";
       for(int i=0; i<s.length(); i++){
        char ch = s.charAt(i);
        if(Character.isLetter(ch)){
            res += k.charAt(idx++);
        }
        else{
            res += ch;
        }
       }
       return res;

    }
}