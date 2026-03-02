class Solution {
    public int findPermutationDifference(String s, String t) {
        int idx1 = 0;
        int idx2 = 0;
        int sum = 0;
        for(int i=0; i<s.length(); i++){
            for(int j=0; j<t.length(); j++){
                char ch = s.charAt(i);
                char dh = t.charAt(j);
                if(ch == dh){
                    idx1 = i;
                    idx2 = j;
                    sum += Math.abs(i - j);
                }
            }
        }
        return sum;
    }
}