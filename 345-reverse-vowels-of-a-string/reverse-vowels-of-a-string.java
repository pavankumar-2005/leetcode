class Solution {
    public String reverseVowels(String s) {
        String vowels = "";
        String ans = "";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U'){
                vowels += ch;
            }
        }
        int idx = vowels.length() - 1;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
             if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U'){
                ans += vowels.charAt(idx);
                idx--;
            }
            else{
                ans += s.charAt(i);
            }
        }
        return ans;
    }
}