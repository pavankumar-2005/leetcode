class Solution {
    public void mergeSort(int[] nums, int left, int right){
        if(left >= right) return;
        int mid = left + (right - left) / 2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid+1, right);
        merge(nums, left, mid, right);
    }
    public void merge(int[] nums, int left, int mid, int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] lp = new int[n1];
        int[] rp = new int[n2];
        int li = 0, ri = 0;
        for(int i=left; i<=mid; i++){
            lp[li++] = nums[i];
        }
        for(int i=mid+1; i<=right; i++){
            rp[ri++] = nums[i];
        }
        int i=0, j=0;
        int idx = left;
        while(i < n1 && j < n2){
            if(lp[i] < rp[j]){
                nums[idx] = lp[i];
                i++;
            }
            else{
                nums[idx] = rp[j];
                j++;
            }
            idx++;
        }
        while(i < n1){
            nums[idx++] = lp[i++];
        }
        while(j < n2){
            nums[idx++] = rp[j++];
        }
    }
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
}