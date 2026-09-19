class Solution {
    public boolean isSafe(int row, int col, char[][] board, int n){
        for(int j=0; j<col; j++){
            if(board[row][j] == 'Q')return false;
        }
        for(int i=row-1, j=col-1; i>=0 && j>=0 ; i--, j--){
            if(board[i][j] == 'Q') return false;
        }
        for(int i=row+1, j=col-1; i<n && j>=0; i++, j--){
            if(board[i][j] == 'Q') return false;
        }
        return true;
    }
    public void nQueens(int col, char[][] board, List<List<String>> res, int n){
        if(col == n){
            List<String> temp = new ArrayList<>();
            for(int i=0; i<n; i++){
                temp.add(new String(board[i]));
            }
            res.add(temp);
            return;
        }
        for(int row = 0; row < n; row++){
            if(isSafe(row, col, board, n)){
                board[row][col] = 'Q';
                nQueens(col + 1, board, res, n);
                board[row][col] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i=0; i<n; i++){
            Arrays.fill(board[i], '.');
        }
        nQueens(0, board, res, n);
        return res;
    }
}