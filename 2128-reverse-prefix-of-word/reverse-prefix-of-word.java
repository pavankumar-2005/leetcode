class Solution {
    public String reversePrefix(String word, char ch) {
        String rev = "";
        int si = 0;
        int fo = 0;
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i) == ch){
                fo = i;
                break;
            }
        }
        for(int i=fo; i>=si; i--){
            rev += word.charAt(i);
        }
        return rev + word.substring(fo+1, word.length());
    }
}