class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] fre = new int[26];
        for(int i=0; i<text.length(); i++){
            char ch = text.charAt(i);
            fre[ch - 'a']++;
        }
        fre[11] /= 2;
        fre[14] /= 2;
        int res = Integer.MAX_VALUE;
        for(int i=0; i<26; i++){
            if(i == 0 || i == 1 || i == 11 || i == 13 || i == 14){
                res = Math.min(res, fre[i]);
            }
        }
        return res;
    }
}