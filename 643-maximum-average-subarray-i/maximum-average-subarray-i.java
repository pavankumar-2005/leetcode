class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg = 0, maxAvg = 0;
        double sum = 0;
        for(int i=0; i<k; i++){
            sum += nums[i];
        }
        avg = sum / (double)k;
        maxAvg = avg;
        for(int i=k; i<nums.length; i++){
            sum -= nums[i - k];
            sum += nums[i];
            avg = sum /(double)k;
            maxAvg = Math.max(maxAvg, avg);
        }
        return maxAvg;
    }
}