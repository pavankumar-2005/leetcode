class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int sum = 0;
        for(int i=0; i<k; i++){
            sum += arr[i];
        }
        int avg = sum / k;
        if(avg >= threshold)count++;
        int i = 0, j = k;
        while(j < arr.length){
            sum += arr[j];
            sum -= arr[i];
            avg = sum / k;
            if(avg >= threshold)count++;
            i++;
            j++;
        }
        return count;
    }
}