class Solution {
    public int compress(char[] chars) {
        List<Character> lst = new ArrayList<>();
        for(char ch : chars){
            lst.add(ch);
        }
        lst.add('~');
        int n = lst.size();
        int j = 0;
        int count = 1;
        for(int i=1; i<n; i++){
            if(lst.get(i) == lst.get(i-1)){
                count++;
            }
            else{
                chars[j++] = lst.get(i-1);
                if(count >= 2){
                    String k = Integer.toString(count);
                    for(char ch : k.toCharArray()){
                        chars[j++] = ch;
                    }
                }
                count = 1;
            }
        }
        return j;
    }
}