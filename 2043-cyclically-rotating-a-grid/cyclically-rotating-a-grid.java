class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int layers = Math.min(m, n) / 2;
        for (int layer = 0; layer < layers; layer++) {
            List<Integer> ring = new ArrayList<>();
            int top = layer, left = layer, bottom = m - layer - 1, right = n - layer - 1;
            for (int j = left; j <= right; j++) ring.add(grid[top][j]);
            for (int i = top + 1; i <= bottom; i++) ring.add(grid[i][right]);
            for (int j = right - 1; j >= left; j--) ring.add(grid[bottom][j]);
            for (int i = bottom - 1; i > top; i--) ring.add(grid[i][left]);
            int len = ring.size();
            int shift = k % len;
            List<Integer> rotated = new ArrayList<>();
            for (int i = 0; i < len; i++) rotated.add(ring.get((i + shift) % len));
            int idx = 0;
            for (int j = left; j <= right; j++) grid[top][j] = rotated.get(idx++);
            for (int i = top + 1; i <= bottom; i++) grid[i][right] = rotated.get(idx++);
            for (int j = right - 1; j >= left; j--) grid[bottom][j] = rotated.get(idx++);
            for (int i = bottom - 1; i > top; i--) grid[i][left] = rotated.get(idx++);
        }
        return grid;
    }
}