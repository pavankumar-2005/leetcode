class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int count = 0;
        int idx = 0;
        int mc = 0;
        for(int i=0; i<mat.length; i++){
            count = 0;
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j] == 1){
                    count++;
                }
            }
            if(count > mc){
                mc = count;
                idx = i;
            }
        }
        int[] a = new int[2];
        a[0] = idx;
        a[1] = mc;
        return a;
    }
}