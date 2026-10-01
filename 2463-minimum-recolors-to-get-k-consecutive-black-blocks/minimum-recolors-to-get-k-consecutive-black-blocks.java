class Solution {
    public int minimumRecolors(String blocks, int k) {
        int whiteC = 0;
        for(int i=0; i<k; i++){
            if(blocks.charAt(i) == 'W')whiteC++;
        }
        int minOpr = whiteC;
        int i=0, j=k;
        while(j < blocks.length()){
            if(blocks.charAt(i) == 'W')whiteC--;
            if(blocks.charAt(j) == 'W')whiteC++;
            minOpr = Math.min(whiteC, minOpr);
            i++;
            j++;
        }
        return minOpr;
    }
}