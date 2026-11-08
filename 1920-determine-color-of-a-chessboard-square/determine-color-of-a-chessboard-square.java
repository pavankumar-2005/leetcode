class Solution {
    public boolean squareIsWhite(String coordinates) {
        char ch = coordinates.charAt(0);
        char num = coordinates.charAt(1);
        if(ch == 'a' || ch == 'c' || ch == 'e' || ch == 'g'){
            if(num == '2' || num == '4' || num == '6' || num == '8'){
                return true;
            }
        }
        else{
            if(num == '1' || num == '3' || num == '5' || num == '7'){
                return true;
            }
        }
        return false;
    }
}