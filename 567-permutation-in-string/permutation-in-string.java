class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if(n1 > n2) return false;
        int[] fre1 = new int[26];
        int[] fre2 = new int[26];
        for(int i=0; i<n1; i++){
            fre1[s1.charAt(i) - 'a']++;
            fre2[s2.charAt(i) - 'a']++;
        }
        if(Arrays.equals(fre1, fre2)) return true;
        int j = 0;
        for(int i=n1; i<n2; i++){
            fre2[s2.charAt(i) - 'a']++;
            fre2[s2.charAt(j) - 'a']--;
            if(Arrays.equals(fre1, fre2)) return true;
            j++;
        }
        return false;
    }
}