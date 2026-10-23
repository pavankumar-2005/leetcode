class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<>();
        int time = 0;
        for(int i=0; i<tickets.length; i++){
            q.offer(i);
        }
        while(!q.isEmpty()){
            int cur = q.poll();
            tickets[cur]--;
            time++;
            if(tickets[k] == 0)break;
            if(tickets[cur] > 0)q.offer(cur);
        }
        return time;
    }
}