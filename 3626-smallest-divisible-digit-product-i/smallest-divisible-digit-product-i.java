class Solution {
    public int smallestNumber(int n, int t) {
        int k = -1;
        int num = n;
        while(k % t != 0){
            int pro = 1;
            int temp = num;
            while(temp > 0){
                pro *= (temp % 10);
                temp /= 10;
            }
            k = pro;
            if(k % t == 0)break;
            num++;
        }
        return num;
    }
}