class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int idx = -1;
        int low = 0, high = arr.length - 1;
        while(low < high){
            int mid = low + (high - low) / 2;
            if(arr[mid] > arr[mid + 1]){
                idx = mid;
                high = mid;
            }
            else{
                low = mid + 1;
            }
        } 
        return idx;        
    }
}