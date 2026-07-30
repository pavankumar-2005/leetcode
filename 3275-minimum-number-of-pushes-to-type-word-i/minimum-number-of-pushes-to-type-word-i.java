class Solution {
    public int minimumPushes(String word) {
        int len = word.length();
        int div = len / 8;
        len -= (div * 8);
        int i = 1;
        int res = 0;
        while(div-->0){
            res += (8 * i);
            i++;
        }
        res += (len * i);
        return res;
    }
}