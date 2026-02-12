class Solution {
    public String restoreString(String s, int[] indices) {
        int idx = 0;
        String k = "";
        for(int i=0; i<indices.length; i++){
          for(int j=0; j<indices.length; j++){
            if(indices[j] == i){
                k += s.charAt(j);
            }
        }
    }
        return k;
    }
}