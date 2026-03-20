class Solution {
    public String removeTrailingZeros(String num) {
        int idx = -1;
        for(int i=num.length() - 1; i>=0; i--){
            if(num.charAt(i) != '0'){
                idx = i+1;
                break;
            }
        }
        return num.substring(0, idx);
    }
}