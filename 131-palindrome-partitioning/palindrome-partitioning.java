class Solution {
    public boolean isPalindrome(String s){
        int i = 0, j = s.length() - 1;
        while(i <= j){
            if(s.charAt(i) != s.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
    public void palPart(String s, List<String> cur, List<List<String>> res){
        if(s.length() == 0){
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int i=0; i<s.length(); i++){
            String part = s.substring(0, i+1);
            if(isPalindrome(part)){
                cur.add(part);
                palPart(s.substring(i+1), cur, res);
                cur.remove(cur.size() - 1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<String> cur = new ArrayList<>();
        List<List<String>> res = new ArrayList<>();
        palPart(s, cur, res);
        return res;
    }
}