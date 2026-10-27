class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gs = 0, cs = 0;
        for(int i : gas){
            gs += i;
        }
        for(int i : cost){
            cs += i;
        }
        if(gs < cs) return -1;
        int cur = 0, srtIdx = 0;
        for(int i=0; i<gas.length; i++){
            cur += (gas[i] - cost[i]);
            if(cur < 0){
                srtIdx = i + 1;
                cur = 0;
            }
        }
        return srtIdx;
    }
}