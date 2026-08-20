class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> lst = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        int sr = 0, sc = 0, er = n, ec = m;
        while((sr < er) && (sc < ec)){
            for(int i=sc; i<ec; i++){
                lst.add(matrix[sr][i]);
            }
            for(int i=sr+1; i<er; i++){
                lst.add(matrix[i][ec-1]);
            }
            for(int i=ec-2; i>=sc; i--){
                if(sr >= er-1)break;
                lst.add(matrix[er-1][i]);
            }
            for(int i=er-2; i>=sr+1; i--){
                if(sc >= ec-1) break;
                lst.add(matrix[i][sc]);
            }
            sr++;
            sc++;
            er--;
            ec--;
        }
        return lst;
    }
}