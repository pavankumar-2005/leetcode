class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n1 = s.length();
        int n2 = p.length();
        List<Integer> ans = new ArrayList<>();
        if(n2 > n1)return ans;
        int[] fre1 = new int[26];
        int[] fre2 = new int[26];
        for(int i=0; i<n2; i++){
            fre1[p.charAt(i) - 'a']++;
        }
        for(int i=0; i<n1; i++){
            fre2[s.charAt(i) - 'a']++;
            if(i >= n2 - 1){
                if(Arrays.equals(fre1, fre2))ans.add(i - n2 + 1);
                fre2[s.charAt(i - n2 + 1) - 'a']--;
            }
        }
        return ans;
    }
}