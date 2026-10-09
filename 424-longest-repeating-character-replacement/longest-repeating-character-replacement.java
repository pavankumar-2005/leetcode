class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxFre = 0;
        int maxLen = 0;
        int[] fre = new int[26];
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            fre[ch - 'A']++;
            maxFre = Math.max(maxFre, fre[ch - 'A']);
            while((i - left + 1) - maxFre > k){
                fre[s.charAt(left) - 'A']--;
                left++;
            }
            maxLen = Math.max(i - left + 1, maxLen);
        }
        return maxLen;
    }
}