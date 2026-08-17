class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> ans = new ArrayList<>();
        ans.add(intervals[0]);
        for(int i=1; i<intervals.length; i++){
            int[] lastInt = ans.get(ans.size() - 1);
            if(intervals[i][0] <= lastInt[1]){
                lastInt[1] = Math.max(lastInt[1], intervals[i][1]);
            }
            else{
                ans.add(intervals[i]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}