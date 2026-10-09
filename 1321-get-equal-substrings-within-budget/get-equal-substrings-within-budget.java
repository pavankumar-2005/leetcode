class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int left = 0, maxLen = 0;
        int curCost = 0;
        for(int i=0; i<s.length(); i++){
            curCost += Math.abs(s.charAt(i) - t.charAt(i));
            while(curCost > maxCost){
                curCost -= Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            }
            maxLen = Math.max(i - left + 1, maxLen);
        }
        return maxLen;
    }
}