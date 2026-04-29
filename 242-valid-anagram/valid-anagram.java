class Solution {
    public boolean isAnagram(String s, String t) {
        boolean flag = true;
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(a.length != b.length){
            flag = false;
        }
        else{
        for(int i=0; i<a.length; i++){
            if(a[i] != b[i]){
                flag = false;
            }
        }
        }
        return flag;
    }
}