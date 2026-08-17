class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ml = 0;
        for(int i=0; i<s.length(); i++){
            Set<Character> st = new HashSet<>();
            String str = "";
            for(int j=i; j<s.length(); j++){
                if(!st.contains(s.charAt(j))){
                    str += s.charAt(j);
                    st.add(s.charAt(j));
                }
                else{
                    ml = Math.max(ml, str.length());
                    break;
                }
            }
            ml = Math.max(ml, str.length());
        }
        return ml;
    }
}