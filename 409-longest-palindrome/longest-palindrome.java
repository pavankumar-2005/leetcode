class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i: mp.values()){
            lst.add(i);
        }
        boolean flag = false;
        for(int i=0; i<lst.size(); i++){
            if(lst.get(i) % 2 != 0){
                flag = true;
                break;
            }
        }
        int count = 0;
        for(int i : lst){
            if(i % 2 == 0){
                count += i;
            }
            else if (i > 1){
                count += (i / 2) * 2;
            }
        }
        return flag ? count + 1 : count;
    }
}