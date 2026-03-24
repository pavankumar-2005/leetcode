class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] fre = new int[101];
        for(int i=0; i<nums.length; i++){
            fre[nums[i]]++;
        }
        int max = 0;
        for(int i=0; i<101; i++){
            if(fre[i] > max){
                max = fre[i];
            }
        }
        int count = 0;
        for(int i=0; i<101; i++){
            if(fre[i] == max){
                count += fre[i];
            }
        }
        return count;
    }
}