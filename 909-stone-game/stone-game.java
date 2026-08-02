class Solution {
    public boolean stoneGame(int[] piles) {
        int alice  = 0;
        int bob = 0;
        Arrays.sort(piles);
        for(int i=piles.length-1; i>=0; i--){
            if(i % 2 != 0){
                alice += piles[i];
            }
            else{
                bob += piles[i];
            }
        }
        return alice > bob;
    }
}