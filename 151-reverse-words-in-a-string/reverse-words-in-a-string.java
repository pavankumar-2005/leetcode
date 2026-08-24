class Solution {
    public String reverseWords(String s) {
        String k = s.trim();
        String[] arr = k.split("\\s+");
        String res = "";
        for(int i = arr.length - 1; i >= 0; i--){
            if(i == 0){
                res += arr[i];
            }
            else{
                res += arr[i];
                res += " ";
            }
        }
        return res;
    }
}