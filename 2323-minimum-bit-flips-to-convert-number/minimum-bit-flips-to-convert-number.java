class Solution {
    public int minBitFlips(int start, int goal) {
        // XOR will highlight differing bits
        int x = start ^ goal;
        int cnt = 0;
        // Count set bits in XOR result
        while (x > 0) {
            cnt += (x & 1);
            x >>= 1;
        }
        return cnt;
    }
}