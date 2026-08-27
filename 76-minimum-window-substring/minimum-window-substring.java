class Solution {
    public String minWindow(String s, String t) {
        int[] fre = new int[256];
        int count = 0;
        int l = 0, r = 0;
        int n = s.length();
        int m = t.length();
        int min = Integer.MAX_VALUE;
        int start = 0;
        for(char ch : t.toCharArray()){
            fre[ch]++;
        }
        while(r < n){
            if(fre[s.charAt(r)] > 0){
                count++;
            }
            fre[s.charAt(r)]--;
            while(count == m){
                if(r - l + 1 < min){
                    min = r - l + 1;
                    start = l;
                }
                fre[s.charAt(l)]++;
                if(fre[s.charAt(l)] > 0){
                    count--;
                }
                l++;
            }
            r++;
        }
        return (min == Integer.MAX_VALUE) ? "" : s.substring(start, start+min);
    }
}