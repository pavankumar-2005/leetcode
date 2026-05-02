class Solution {
    public int rotatedDigits(int n) {
        int count = 0;
        for(int i=1; i<=n; i++){
            boolean flag = false;
            int num = i;
            while(num > 0){
                int rem = num % 10;
                if(rem == 2 || rem == 5 || rem == 6 || rem == 9){
                    flag = true;
                }
                 if((rem == 1 || rem == 0 || rem == 8 ) && flag == true){
                    flag = true;
                }
                if(rem == 3 || rem == 4 || rem == 7){
                    flag = false;
                    break;
                }
                num /= 10;
            }
                if(flag){
                    count++;
                }
        }
        return count;
    }
}