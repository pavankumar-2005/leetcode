class Solution {
    public boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')return true;
        return false;
    }
    public int maxVowels(String s, int k) {
        int mc = 0, c = 0;
        for(int i=0; i<k; i++){
            if(isVowel(s.charAt(i))){
                c++;
            }
        }
        mc = Math.max(mc, c);
        int i=0, j=k;
        while(i < j && j < s.length()){
            if(isVowel(s.charAt(i))){
                c--;
            }
            if(isVowel(s.charAt(j)))c++;
            mc =  Math.max(c, mc);
            i++; 
            j++;
        }
        return mc;
    }
}