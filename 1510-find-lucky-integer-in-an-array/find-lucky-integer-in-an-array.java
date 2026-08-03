class Solution {
    public int findLucky(int[] arr) {
         int[] fre = new int[501];
         for(int i=0; i<arr.length; i++){
            fre[arr[i]]++;
         }
         for(int i=500; i>0; i--){
            if(fre[i] == i)return i;
         }
        return -1;
    }
}