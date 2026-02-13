class Solution {
    public String maximumOddBinaryNumber(String s) {
        int oc = 0;
        int zc = 0;
        String k = "";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '1'){
                oc++;
            }
            else{
                zc++;
            }
        }
        while(oc > 1){
            if(oc != 1){
                k += '1';
                oc--;
            }
        }
        while(zc > 0){
            k += '0';
            zc--;
        }
        k += '1';
        return k;
    }
}