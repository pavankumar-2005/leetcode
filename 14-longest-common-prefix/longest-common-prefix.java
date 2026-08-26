class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0 || strs[0] == null) return "";
        Arrays.sort(strs);
        String f = strs[0];
        String l = strs[strs.length - 1];
        int idx = 0;
        while(idx < f.length() && idx < l.length()){
            if(f.charAt(idx) == l.charAt(idx)){
                idx++;
            }
            else{
                break;
            }
        }
        return f.substring(0, idx);
    }
}