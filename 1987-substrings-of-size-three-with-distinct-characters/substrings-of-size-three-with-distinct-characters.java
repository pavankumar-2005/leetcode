class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;
        Map<Character, Integer> mp = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
            if(i >= 2){
                if(mp.size() == 3)count++;
                char prev = s.charAt(i - 3 + 1);
                mp.put(prev, mp.get(prev) - 1);
                if(mp.get(prev) == 0) mp.remove(prev);
            }
        }
        return count;
    }
}