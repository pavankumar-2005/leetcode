class Solution {
    public int largestAltitude(int[] gain) {
        int maxAltitude = 0;
        int n = gain.length;
        int[] pre = new int[n];
        pre[0] = gain[0];
        for(int i=1; i<n; i++){
            pre[i] = pre[i-1] + gain[i];
        }
        Arrays.sort(pre);
        maxAltitude = pre[n-1];
        if(maxAltitude > 0){
            return maxAltitude;
        }
        return 0;

    }
}