class Solution {
    public boolean check(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        int[] fre = new int[26];
        for(int i=0; i<s1.length(); i++){
            fre[s1.charAt(i) - 'a']++;
            fre[s2.charAt(i) - 'a']--;
        }
        for(int i=0; i<26; i++){
            if(fre[i] != 0)return false;
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if(n > m) return false;
        for(int i=0; i<=m - n; i++){
            String sub = s2.substring(i, (i+n));
            if(check(s1, sub))return true;
        }
        return false;
    }
}