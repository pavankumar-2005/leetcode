class Solution {
    public boolean solve(int row, int col, char[][] board, String word, int idx, boolean[][] vis, int m, int n){
        if(idx == word.length() - 1) return true;
        vis[row][col] = true;
        boolean ans1 = isValid(row-1, col, board, word, idx+1, vis, m, n) && solve(row-1, col, board, word, idx+1, vis, m, n);
        boolean ans2 = isValid(row, col+1, board, word, idx+1, vis, m, n) && solve(row, col+1, board, word, idx+1, vis, m, n);
        boolean ans3 = isValid(row+1, col, board, word, idx+1, vis, m, n) && solve(row+1, col, board, word, idx+1, vis, m, n);
        boolean ans4 = isValid(row, col-1, board, word, idx+1, vis, m, n) && solve(row, col-1, board, word, idx+1, vis, m, n);
        vis[row][col] = false;
        return ans1 || ans2 || ans3 || ans4;
    }
    public boolean isValid(int row, int col, char[][] board, String word, int idx, boolean[][] vis, int m, int n){
        if(row < 0 || col < 0 || row >= m || col >= n || vis[row][col] == true || board[row][col] != word.charAt(idx)) return false;
        return true;
    }
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] vis = new boolean[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(board[i][j] == word.charAt(0)){
                    if(solve(i, j, board, word, 0, vis, m, n)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}