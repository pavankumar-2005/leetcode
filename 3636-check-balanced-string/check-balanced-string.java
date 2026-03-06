class Solution {
    public boolean isBalanced(String num) {
        int es = 0;
        int os = 0;
        for(int i=0; i<num.length(); i++){
            if(i % 2 == 0){
                es += num.charAt(i) - '0';
            }
            else{
                os += num.charAt(i) - '0';
            }
        }
        if(es == os){
            return true;
        }
        return false;
    }
}