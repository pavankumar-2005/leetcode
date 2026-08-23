class Solution {
    public boolean isPalindrome(String s) {
        String k = s.toLowerCase();
        String str = "";
        for(int i=0; i<k.length(); i++){
            char ch = k.charAt(i);
            if(Character.isLetter(ch) || Character.isDigit(ch)){
                str += ch;
            }
        }
        int i = 0, j = str.length() - 1;
        while(i <= j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}