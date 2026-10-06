class Solution {
    public int totalFruit(int[] fruits) {
        int maxLen = 0;
        int left = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<fruits.length; i++){
            int val = fruits[i];
            mp.put(val, mp.getOrDefault(val, 0) + 1);
            while(mp.size() > 2){
                mp.put(fruits[left], mp.get(fruits[left]) - 1);
                if(mp.get(fruits[left]) == 0) mp.remove(fruits[left]);
                left++;
            }
            maxLen = Math.max(maxLen, i - left + 1);
        }
        return maxLen;
    }
}