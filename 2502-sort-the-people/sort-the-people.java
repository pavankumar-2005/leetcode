class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer, String> mp = new TreeMap<>();
        for(int i=0; i<heights.length; i++){
            mp.put(heights[i], names[i]);
        }
        String[] s = new String[names.length];
        int idx = 0;
        for(int key: mp.descendingKeySet()){
            s[idx++] = mp.get(key);
        }
        return s;
    }
}