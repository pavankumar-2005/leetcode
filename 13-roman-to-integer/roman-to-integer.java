import java.util.*;

public class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> m = new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        int n = s.length(), res = 0;
        for (int i = 0; i < n; i++) {
            int val = m.get(s.charAt(i));
            if (i < n - 1 && val < m.get(s.charAt(i + 1))) res -= val;
            else res += val;
        }
        return res;
    }
}