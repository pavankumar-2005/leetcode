class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        long pro = 1;
        int k = n;
        while(k > 0){
            int num = k % 10;
            sum += num;
            pro *= num;
            k /= 10;
        }
        if((n % (sum + pro)) == 0) return true;
        return false;
    }
}