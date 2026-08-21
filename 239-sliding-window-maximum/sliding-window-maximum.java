class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        List<Integer> lst = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();
        dq.addLast(0);
        for(int i=1; i<k; i++){
            while(!dq.isEmpty() && nums[i] >= nums[dq.getLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        lst.add(nums[dq.getFirst()]);
        for(int i=k; i<n; i++){
            if(i - dq.getFirst() >= k){
                dq.removeFirst();
            }
            while(!dq.isEmpty() && nums[i] >= nums[dq.getLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
            lst.add(nums[dq.getFirst()]);
        }
        int[] a = new int[lst.size()];
        for(int i=0; i<lst.size(); i++){
            a[i] = lst.get(i);
        }
        return a;
    }
}