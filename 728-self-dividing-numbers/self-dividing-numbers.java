class Solution {
    public boolean isSelfDiv(int num){
        int m = num;
        while(m > 0){
            int k = m % 10;
            if(k == 0 || num % k != 0)return false;
            m /= 10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> lst = new ArrayList<>();
        for(int i=left; i<=right; i++){
            if(isSelfDiv(i))lst.add(i);
        }
        return lst;
    }
}