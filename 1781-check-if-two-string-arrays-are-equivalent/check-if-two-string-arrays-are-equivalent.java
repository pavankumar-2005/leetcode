class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String r1 = "";
        String r2 = "";
        for(int i=0; i<word1.length; i++){
            String s = word1[i];
            r1 += s;
        }
        for(int i=0; i<word2.length; i++){
            String s = word2[i];
            r2 += s;
        }
        if(r1.equals(r2)){
            return true;
        }
        return false;

    }
}