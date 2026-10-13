class Solution {
    public int divisorSubstrings(int num, int k) {
        int count = 0, left = 0;
        String s = Integer.toString(num);
        String l = s.substring(0, k);
        int n = Integer.parseInt(l);
        if(num % n == 0) count++;
        for(int i=k; i<s.length(); i++){
            String v = s.substring(left + 1, i + 1);
            if(v.length() == 0){
                left++;
                continue;
            }
            int r = Integer.valueOf(v);
            if(r == 0){
                left++;
                continue;
            }    
            if(num % r == 0) count++;
            left++;
        }
        return count;
    }
}