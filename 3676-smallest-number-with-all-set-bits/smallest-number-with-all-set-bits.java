class Solution {
    public int smallestNumber(int n) {
        if(n == 1) return 1;
        int ans = 3;
        for(int i=0; i<1000; i++){
            if(ans >= n){
                break;
            }
            else{
                ans = (ans * 2) + 1;
            }
        }
        return ans;
    }
}