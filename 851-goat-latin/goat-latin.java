class Solution {
    public String toGoatLatin(String sentence) {
        String[] s = sentence.split(" ");
        String k[] = new String[s.length];
        for (int i = 0; i < s.length; i++) {
            String tom = s[i];
            String res = "";
            char ch = tom.charAt(0);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {
                for (int j = 0; j < tom.length(); j++) {
                    res += tom.charAt(j);
                }
                res += "ma";
            } else {
                res += tom.substring(1, tom.length());
                res += tom.charAt(0);
                res += "ma";
            }
            for (int l = 1; l <= i + 1; l++) {
                res += 'a';
            }
            k[i] = res;
        }
        String out = "";
        for (int i = 0; i < k.length - 1; i++) {
            out += k[i];
            out += " ";
        }
        out += k[k.length - 1];
        return out;
    }
}