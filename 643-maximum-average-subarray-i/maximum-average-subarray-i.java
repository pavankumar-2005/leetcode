class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = 0.0;
        int sum = 0;
        for(int i=0; i<k; i++){
            sum += nums[i];
        }
        maxAvg = sum/(double)k;
        int i=0, j=k;
        while(i < j && j < nums.length){
            sum += nums[j];
            sum -= nums[i];
            maxAvg = (double)Math.max(sum/(double)k, maxAvg);
            i++;
            j++;
        }
        return maxAvg;
    }
}