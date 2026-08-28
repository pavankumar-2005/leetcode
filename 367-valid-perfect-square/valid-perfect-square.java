class Solution {
    public boolean isPerfectSquare(int num) {
        long l = 1;
        long r = num;
        while (l <= r) {
            long mid = l + (r - l) / 2;
            long sr = mid * mid;
            if (sr == num) {
                return true;
            } else if (sr < num) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return false;
    }
}