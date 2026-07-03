class Solution {
    public int maximum69Number (int num) {
        String s = Integer.toString(num);
        int idx = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != '9'){
                idx = i;
                break;
            }
        }
        String k = s.substring(0, idx) + '9' + s.substring(idx+1);
        return Integer.parseInt(k);
    }
}