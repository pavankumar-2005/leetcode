class Solution {
    public int totalMoney(int n) {
        if(n <= 7) return((n*(n+1))/2);
        int weeks = n / 7;
        int k = weeks+1;
        int sum = 0;
        int l = 28;
        for(int i=1; i<=weeks; i++){
            sum += l;
            l += 7;
        }
        int rem = n % 7;
        while(rem-->0){
            sum += k;
            k++;
        }
        return sum;
    }
}