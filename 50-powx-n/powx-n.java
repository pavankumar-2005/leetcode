class Solution {
    public double myPow(double x, int n) {
        double ans = 1;
        long m = n;
        if(m < 0) m = -m;
        while(m > 0){
            if(m % 2 == 0){
                m /= 2;
                x = x*x;
            }
            else{
                ans *= x;
                m--;
            }
        }
        if(n < 0){
            return 1.0 /(double)ans;
        }
        return ans;
    }
}