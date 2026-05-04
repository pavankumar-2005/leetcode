class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] mat = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                mat[i][j] = matrix[i][j];
            }
        }
        int l = 0;
        for(int i=n-1; i>=0; i--){
            int k = 0;
            for(int j=0; j<n; j++){
                if(k < n && l < n){
                    matrix[k][l] = mat[i][j];
                    k++;
                }
            }
            l++;
        }
    }
}