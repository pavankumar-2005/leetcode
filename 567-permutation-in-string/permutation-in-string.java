class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        if(l1 > l2) return false;
        int[] fre1 = new int[26];
        int[] fre2 = new int[26];
        for(int i=0; i<l1; i++){
            fre1[s1.charAt(i) - 'a']++;
        }
        for(int i=0; i<l2; i++){
            fre2[s2.charAt(i) - 'a']++;
            if(i >= l1 - 1){
                if(Arrays.equals(fre1, fre2)) return true;
                fre2[s2.charAt(i - l1 + 1) - 'a']--;
            }
        }
        return false;
    }
}