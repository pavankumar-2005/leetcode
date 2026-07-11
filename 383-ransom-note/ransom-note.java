class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        ArrayList<Character> lst = new ArrayList<>();
        for(int i=0; i<magazine.length(); i++){
            lst.add(magazine.charAt(i));
        }
        for(int i=0; i<ransomNote.length(); i++){
            if(!lst.contains(ransomNote.charAt(i))){
                return false;
            }
            else{
                lst.remove((Character)ransomNote.charAt(i));
            }
        }
        return true;
    }
}