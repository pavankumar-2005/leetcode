class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if(words.size() != s.length()) return false;
        int i = 0;
        while(i < s.length()){
            String k = words.get(i);
            char ch = k.charAt(0);
            char bh = s.charAt(i);
            if(ch != bh){
                return false;
            }
            else{
                i++;
            }            
        }
        return true;
    }
}