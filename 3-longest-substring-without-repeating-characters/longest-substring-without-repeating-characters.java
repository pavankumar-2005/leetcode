class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLen = 0;
        Map<Character, Integer> mp = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            while(mp.containsKey(ch)){
                mp.remove(s.charAt(left));
                left++;
            }
            mp.put(ch, mp.getOrDefault(ch, 0)+1);
            maxLen = Math.max(maxLen, mp.size());
        }
        return maxLen;
    }
}