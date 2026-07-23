class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        Set<Integer> st = new HashSet<>();
        for(int i=0; i<n; i++){
            st.add(candyType[i]);
        }
        return Math.min(st.size(), n/2);
    }
}