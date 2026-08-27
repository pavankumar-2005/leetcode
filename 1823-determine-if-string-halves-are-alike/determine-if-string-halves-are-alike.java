class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        String s1 = s.substring(0, n/2);
        String s2 = s.substring(n/2, n);
        int a = 0, b = 0;
        for(int i=0; i<s1.length(); i++){
            char ch = Character.toLowerCase(s1.charAt(i));
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')a++;
        }
        for(int i=0; i<s2.length(); i++){
            char ch = Character.toLowerCase(s2.charAt(i));
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')b++;
        }
        return a == b;
    }
}