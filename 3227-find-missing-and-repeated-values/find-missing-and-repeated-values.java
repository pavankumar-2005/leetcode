class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] fre = new int[n*n+1];
        for(int i=0; i<n; i++){
            for(int j=0; j<grid[0].length; j++){
                fre[grid[i][j]]++;
            }
        }
        int[] res = new int[2];
        for(int i=1; i<fre.length; i++){
            if(fre[i] == 2){
                res[0] = i;
            }
            if(fre[i] == 0){
                res[1] = i;
            }
        }
        return res;
    }
}