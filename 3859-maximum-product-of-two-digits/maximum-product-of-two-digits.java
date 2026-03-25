class Solution {
    public int maxProduct(int n) {
         String s = Integer.toString(n);
         String[] a = s.split("");
         Arrays.sort(a);
         int l = Integer.valueOf(a[a.length - 1]);
         int b = Integer.valueOf(a[a.length - 2]);
         return l * b;
    }
}