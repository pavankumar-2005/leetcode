class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> st = new HashSet<>();
        for(int i=0; i<word.length(); i++){
            st.add(word.charAt(i));
        }
        char ch1 = 'a';
        char ch2 = 'A';
        int count = 0;
        for(int i=0; i<26; i++){
            if(st.contains(ch1) && st.contains(ch2)){
                count++;
            }
            ch1++;
            ch2++;
        }
        return count;
    }
}