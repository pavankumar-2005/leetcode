class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }
        int[] res = new int[k];
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> mp.get(b) - mp.get(a));
        for(int num : mp.keySet()){
            pq.offer(num);
        }
        int idx = 0; 
        for(int i=0; i<k; i++){
            res[idx++] = pq.poll();
        }
        return res;
    }
}