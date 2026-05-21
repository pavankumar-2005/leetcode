class Solution {
    public int[] separateDigits(int[] nums) {
        List<Character> lst = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            String s = String.valueOf(nums[i]);
            for(int j=0; j<s.length(); j++){
                lst.add(s.charAt(j));
            }
        }
        int[] a = new int[lst.size()];
        for(int i=0; i<a.length; i++){
            a[i] = lst.get(i) - '0';
        }
        return a;
    }
}