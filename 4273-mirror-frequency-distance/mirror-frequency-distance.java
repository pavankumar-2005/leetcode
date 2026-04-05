class Solution {
    public int mirrorFrequency(String s) {
        int[] dfreq = new int[10];
        int[] lfreq = new int[26];
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch)) {
                dfreq[ch - '0']++;
            }
            else {
                lfreq[ch - 'a']++;
            }
        }
        int mf = 0;
        for(int i = 0; i < 5; i++) {
            mf += Math.abs(dfreq[i] - dfreq[10 - i - 1]);
        }
        for(int i = 0; i < 13; i++) {
            mf += Math.abs(lfreq[i] - lfreq[26 - i - 1]);
        }
        return mf;
    }
}