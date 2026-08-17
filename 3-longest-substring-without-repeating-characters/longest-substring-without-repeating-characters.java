class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ml = 0;
        int i = 0;
        int j = 0;
        HashSet<Character> st = new HashSet<>();
        while(j < s.length()){
            if(!st.contains(s.charAt(j))){
                st.add(s.charAt(j));
                ml = Math.max(ml, j-i+1);
                j++;
            }
            else{
                st.remove(s.charAt(i));
                i++;
            }
        }
        return ml;
    }
}