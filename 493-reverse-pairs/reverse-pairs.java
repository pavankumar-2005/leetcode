class Solution {
    public int countPairs(int[] arr, int low, int mid, int high){
        int count = 0;
        int right = mid + 1;
        for(int left = low; left <= mid; left++){
            while(right <= high && (long)arr[left] > (2L * arr[right])) right++;
            count += right - (mid + 1);
        }
        return count;
    }
    public int mergeSort(int[] arr, int low, int high){
        int count = 0;
        if(low < high){
            int mid = (low + high) / 2;
            count += mergeSort(arr, low, mid);
            count += mergeSort(arr, mid+1, high);
            count += countPairs(arr, low, mid, high);
            merge(arr, low, mid, high);
        }
        return count;
    }

    public void merge(int[] arr, int low, int mid, int high){
        int i = low; 
        int j = mid + 1;
        int[] temp = new int[high - low +1];
        int idx = 0;
        while(i <= mid && j <= high){
            if(arr[i] < arr[j]){
                temp[idx++] = arr[i++];
            }
            else{
                temp[idx++] = arr[j++];
            }
        }

        while(i <= mid){
            temp[idx++] = arr[i++];
        }
        while(j <= high){
            temp[idx++] = arr[j++];
        }
        for(int k=0; k<temp.length; k++){
            arr[low + k] = temp[k];
        }
    }
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }
}