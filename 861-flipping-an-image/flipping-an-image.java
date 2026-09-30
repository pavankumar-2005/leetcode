class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int m = image[0].length;
        for(int i=0; i<n; i++){
            int j = 0, k = m-1;
            while(j <= k){
                int temp = image[i][j];
                image[i][j] = 1 - image[i][k];
                image[i][k] = 1 - temp;
                j++;
                k--;
            }
        }
        return image;
    }
}