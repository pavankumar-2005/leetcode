class Solution {
    public int maximumLengthSubstring(String s) {
        int left = 0, maxLen = 0;
        Map<Character, Integer> mp = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            mp.put(ch, mp.getOrDefault(ch,0) + 1);
            while(mp.get(ch) > 2){
                mp.put(s.charAt(left), mp.get(s.charAt(left)) - 1);
                if(mp.get(s.charAt(left)) == 0)mp.remove(s.charAt(left));
                left++;
            }
            maxLen = Math.max(i - left + 1, maxLen);
        }
        return maxLen;
    }
}