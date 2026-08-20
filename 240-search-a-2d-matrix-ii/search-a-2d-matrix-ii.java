class Solution {
    public boolean bs(int[] arr, int target){
        int i = 0;
        int j = arr.length-1;
        while(i <= j){
            int mid = (i + j)/2;
            if(arr[mid] == target){
                return true;
            }
            else if(arr[mid] > target){
                j = mid - 1;
            }
            else{
                i = mid + 1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length; 
        int m = matrix[0].length;
        for(int i=0; i<matrix.length; i++){
            if(target >= matrix[i][0] && target <= matrix[i][m-1]){
                if(bs(matrix[i], target))return true;
            }
        }
        return false;
    }
}