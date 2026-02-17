class Solution {
    public int reverseDegree(String s) {
        char k = 'a';
        char[] ch = new char[26];
        for(int i=ch.length-1; i>=0; i--){
            ch[i] = k;
            k++;
        }
        int sum = 0;
        for(int i=0; i<s.length(); i++){
            int val = 0;
            char a = s.charAt(i);
            for(int j=0; j<ch.length; j++){
                if(a == ch[j]){
                    val = j;
                    break;
                }
            }
            sum += (i+1)*(val + 1);
        }
        return sum;
    }
}