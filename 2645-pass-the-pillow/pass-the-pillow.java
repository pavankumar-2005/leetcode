class Solution {
    public int passThePillow(int n, int time) {
        int rt = n - 1;
        int ft = time / rt;
        int et = time % rt;
        if(ft % 2 == 0){
            return 1 + et;
        }
        else{
            return n - et;
        }
    }
}