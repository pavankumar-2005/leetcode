class Solution {
    public int firstUniqChar(String s) {
        int[] fre = new int[26];
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            fre[ch - 'a']++;
            q.offer(i);
        }
        while(!q.isEmpty()){
            int idx = q.peek();
            char ch = s.charAt(idx);
            if(fre[ch - 'a'] > 1)q.poll();
            else return q.peek();
        }
        return -1;
    }
}